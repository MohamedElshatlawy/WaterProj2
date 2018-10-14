package com.example.mohamed.waterproj_2;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Bill implements Serializable {


    private String PER_NAME;
    private String CUST_ID;
    private String COMP;
    private String P_RED;
    private String C_RED;
    private String CON;
    private String ACT_NAME;
    private String cust_elc;
    private String comp_name;
    private String METR_STAT;
    private String L;
    private String TOT;
    @SerializedName("PAY_TYP")
    private String PAY_TYPE;
    private String NAME;
    private String CUST_NAME;
    private String SEC_NAME;


    public Bill(String PER_NAME, String CUST_ID, String COMP, String p_RED, String c_RED, String CON, String ACT_NAME, String cust_elc, String comp_name, String METR_STAT, String l, String TOT, String PAY_TYPE, String NAME, String CUST_NAME, String SEC_NAME) {
        this.PER_NAME = PER_NAME;
        this.CUST_ID = CUST_ID;
        this.COMP = COMP;
        P_RED = p_RED;
        C_RED = c_RED;
        this.CON = CON;
        this.ACT_NAME = ACT_NAME;
        this.cust_elc = cust_elc;
        this.comp_name = comp_name;
        this.METR_STAT = METR_STAT;
        L = l;
        this.TOT = TOT;
        this.PAY_TYPE = PAY_TYPE;
        this.NAME = NAME;
        this.CUST_NAME = CUST_NAME;
        this.SEC_NAME = SEC_NAME;
    }

    public String getL() {
        return L;
    }

    public String getPER_NAME() {
        return PER_NAME;
    }

    public String getCUST_ID() {
        return CUST_ID;
    }

    public String getCOMP() {
        return COMP;
    }

    public String getP_RED() {
        return P_RED;
    }

    public String getC_RED() {
        return C_RED;
    }

    public String getCON() {
        return CON;
    }

    public String getACT_NAME() {
        return ACT_NAME;
    }

    public String getCust_elc() {
        return cust_elc;
    }

    public String getComp_name() {
        return comp_name;
    }

    public String getMETR_STAT() {
        return METR_STAT;
    }

    public String getTOT() {
        return TOT;
    }

    public String getPAY_TYPE() {
        return PAY_TYPE;
    }

    public String getNAME() {
        return NAME;
    }

    public String getCUST_NAME() {
        return CUST_NAME;
    }

    public String getSEC_NAME() {
        return SEC_NAME;
    }
}
