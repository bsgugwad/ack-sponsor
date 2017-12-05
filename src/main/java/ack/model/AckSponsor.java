package ack.model;

import com.fasterxml.jackson.annotation.JsonGetter;

public class AckSponsor {

    private String ackId;
    private String formPlanYearBeginDate;
    private String formTaxPrd;
    private String typePlanEntityCd;
    private String planName;
    private String sponsordFEname;
    private String sponsdFEmailUsState;

    @JsonGetter("ackid")
    public String getAckId() {
        return ackId;
    }

    public void setAckId(String ackId) {
        this.ackId = ackId;
    }

    @JsonGetter("formplanyearbegindate")
    public String getFormPlanYearBeginDate() {
        return formPlanYearBeginDate;
    }

    public void setFormPlanYearBeginDate(String formPlanYearBeginDate) {
        this.formPlanYearBeginDate = formPlanYearBeginDate;
    }

    @JsonGetter("formtaxprd")
    public String getFormTaxPrd() {
        return formTaxPrd;
    }

    public void setFormTaxPrd(String formTaxPrd) {
        this.formTaxPrd = formTaxPrd;
    }

    @JsonGetter("typeplanentitycd")
    public String getTypePlanEntityCd() {
        return typePlanEntityCd;
    }

    public void setTypePlanEntityCd(String typePlanEntityCd) {
        this.typePlanEntityCd = typePlanEntityCd;
    }

    @JsonGetter("planname")
    public String getPlanName() {
        return planName;
    }

    public void setPlanName(String planName) {
        this.planName = planName;
    }

    @JsonGetter("sponsordfename")
    public String getSponsordFEname() {
        return sponsordFEname;
    }

    public void setSponsordFEname(String sponsordFEname) {
        this.sponsordFEname = sponsordFEname;
    }

    @JsonGetter("sponsdfemailusstate")
    public String getSponsdFEmailUsState() {
        return sponsdFEmailUsState;
    }

    public void setSponsdFEmailUsState(String sponsdFEmailUsState) {
        this.sponsdFEmailUsState = sponsdFEmailUsState;
    }
}
