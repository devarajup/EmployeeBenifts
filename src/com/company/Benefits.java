package com.company;

public class Benefits {
    private  String benefitId;
    private  String benefitName;
    private  String Desc;

    public Benefits(String benefitId, String benefitName, String desc) {
        this.benefitId = benefitId;
        this.benefitName = benefitName;
        Desc = desc;
    }

    public String getBenefitId() {
        return benefitId;
    }

    public void setBenefitId(String benefitId) {
        this.benefitId = benefitId;
    }

    public String getBenefitName() {
        return benefitName;
    }

    public void setBenefitName(String benefitName) {
        this.benefitName = benefitName;
    }

    public String getDesc() {
        return Desc;
    }

    public void setDesc(String desc) {
        Desc = desc;
    }

    @Override
    public String toString() {
        return
                "  benefitId:" + benefitId +
                " \n benefitName:" + benefitName +
                " \n Description:" + Desc                 ;
    }
}
