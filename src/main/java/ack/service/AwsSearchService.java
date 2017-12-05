package ack.service;

import ack.model.AckSponsor;
import ack.util.HttpClientUtil;
import org.apache.http.client.methods.HttpGet;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AwsSearchService {

    public static final String AWS_URL = "https://search-awselasticsearch-ztwnkdiuuxp3yujo6otxasffiu.us-west-1.es.amazonaws.com/ack/_search?q=";


    public List<AckSponsor> search(String plan, String sponsor, String state) {
        List<AckSponsor> ackSponsors = HttpClientUtil.connectAndGetResponse(getHttpRequestWithParameters(plan, sponsor, state));
        return ackSponsors;
    }

    public List<AckSponsor> searchById(String id) {
        List<AckSponsor> ackSponsors = HttpClientUtil.connectAndGetResponse(getHttpRequest(id));
        return ackSponsors;
    }



    private HttpGet getHttpRequestWithParameters(String plan, String sponsor, String state) {
        String elastic_search_url = AWS_URL + "planname:" + plan + "+sponsordfename:" + sponsor + "+sponsdfemailusstate:" + state;
        HttpGet httpGet = new HttpGet(elastic_search_url);
        return httpGet;
    }

    private HttpGet getHttpRequest(String id) {
        String elastic_search_url = AWS_URL + id;
        HttpGet httpGet = new HttpGet(elastic_search_url);
        return httpGet;
    }

}
