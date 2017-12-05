package ack.util;

import ack.model.AckSponsor;
import ack.model.AckSponsorDTO;

import java.util.ArrayList;
import java.util.List;

public class AckSponsorTransformer {

    public static List<AckSponsorDTO> transformToDTO(List<AckSponsor> response) {
        List<AckSponsorDTO> dto = new ArrayList<>();
        response.forEach(ack -> {
            AckSponsorDTO ackSponsorDTO = new AckSponsorDTO();
            ackSponsorDTO.setAckId(ack.getAckId());
            ackSponsorDTO.setFormPlanYearBeginDate(ack.getFormPlanYearBeginDate());
            ackSponsorDTO.setFormTaxPrd(ack.getFormTaxPrd());
            ackSponsorDTO.setTypePlanEntityCd(ack.getTypePlanEntityCd());
            ackSponsorDTO.setPlanName(ack.getPlanName());
            ackSponsorDTO.setSponsordFEname(ack.getSponsordFEname());
            ackSponsorDTO.setSponsdFEmailUsState(ack.getSponsdFEmailUsState());
            dto.add(ackSponsorDTO);
        });
        return dto;
    }

}
