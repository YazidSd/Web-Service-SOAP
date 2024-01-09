package ws;

import java.util.Date;

public class Compte {

    private int code;
    private double solde;

    private Date dateCréation;

    public Compte() {
    }

    public Compte(int code, double solde, Date dateCréation) {
        this.code = code;
        this.solde = solde;
        this.dateCréation = dateCréation;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public Date getDateCréation() {
        return dateCréation;
    }

    public void setDateCréation(Date dateCréation) {
        this.dateCréation = dateCréation;
    }
}
