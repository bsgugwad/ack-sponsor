package ack.model;

public class AckSponsorDTO {

    private String ackId;
    private String formPlanYearBeginDate;
    private String formTaxPrd;
    private String typePlanEntityCd;
    private String planName;
    private String sponsordFEname;
    private String sponsdFEmailUsState;


    public String getAckId() {
        return ackId;
    }

    public void setAckId(String ackId) {
        this.ackId = ackId;
    }

    public String getFormPlanYearBeginDate() {
        return formPlanYearBeginDate;
    }

    public void setFormPlanYearBeginDate(String formPlanYearBeginDate) {
        this.formPlanYearBeginDate = formPlanYearBeginDate;
    }

    public String getFormTaxPrd() {
        return formTaxPrd;
    }

    public void setFormTaxPrd(String formTaxPrd) {
        this.formTaxPrd = formTaxPrd;
    }

    public String getTypePlanEntityCd() {
        return typePlanEntityCd;
    }

    public void setTypePlanEntityCd(String typePlanEntityCd) {
        this.typePlanEntityCd = typePlanEntityCd;
    }

    public String getPlanName() {
        return planName;
    }

    public void setPlanName(String planName) {
        this.planName = planName;
    }

    public String getSponsordFEname() {
        return sponsordFEname;
    }

    public void setSponsordFEname(String sponsordFEname) {
        this.sponsordFEname = sponsordFEname;
    }

    public String getSponsdFEmailUsState() {
        return sponsdFEmailUsState;
    }

    public void setSponsdFEmailUsState(String sponsdFEmailUsState) {
        this.sponsdFEmailUsState = sponsdFEmailUsState;
    }
}
