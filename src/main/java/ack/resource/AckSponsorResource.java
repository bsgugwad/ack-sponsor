package ack.resource;

import ack.model.AckSponsor;
import ack.model.AckSponsorDTO;
import ack.service.AwsSearchService;
import ack.service.GetExample;
import ack.util.AckSponsorTransformer;
import org.apache.http.client.methods.HttpGet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.inject.Named;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

@Component
@Named
@Path("/ack/sponsor/search")
@Produces(MediaType.APPLICATION_JSON)
public class AckSponsorResource {

    // can @Autowired be used
    AwsSearchService awsSearchService = new AwsSearchService();

    @Path("/{id}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<AckSponsorDTO> getAckSponsorById(@PathParam("id") String id) {
        List<AckSponsor> response = awsSearchService.searchById(id);
        List<AckSponsorDTO> dto = AckSponsorTransformer.transformToDTO(response);
        return dto;
    }

    @Path("/{plan}/{sponsor}/{state}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<AckSponsorDTO> getAckSponsor(@PathParam("plan") String plan, @PathParam("sponsor") String sponsor, @PathParam("state") String state) {
        List<AckSponsor> ackSponsors = awsSearchService.search(plan, sponsor, state);
        List<AckSponsorDTO> ackSponsorDTOs = AckSponsorTransformer.transformToDTO(ackSponsors);
        return ackSponsorDTOs;
    }

}
