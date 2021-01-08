package lk.ijse.spring.dto;

import lk.ijse.spring.entity.RequestDetails;

public class PaymentDTO {
    private int paymentID;
    private String payDate;
    private double astimatTotal;
    private double extraKM;
    private double priceForExtraKM;
    private double damadgeValue;
    private String damadgeDesc;
    private double finalTotal;
    private String rDetails;

    public PaymentDTO() {
    }

    public PaymentDTO(int paymentID, String payDate, double astimatTotal, double extraKM, double priceForExtraKM, double damadgeValue, String damadgeDesc, double finalTotal, String rDetails) {
        this.paymentID = paymentID;
        this.payDate = payDate;
        this.astimatTotal = astimatTotal;
        this.extraKM = extraKM;
        this.priceForExtraKM = priceForExtraKM;
        this.damadgeValue = damadgeValue;
        this.damadgeDesc = damadgeDesc;
        this.finalTotal = finalTotal;
        this.rDetails = rDetails;
    }

    public String getPayDate() {
        return payDate;
    }

    public void setPayDate(String payDate) {
        this.payDate = payDate;
    }

    @Override
    public String toString() {
        return "PaymentDTO{" +
                "paymentID=" + paymentID +
                ", payDate='" + payDate + '\'' +
                ", astimatTotal=" + astimatTotal +
                ", extraKM=" + extraKM +
                ", priceForExtraKM=" + priceForExtraKM +
                ", damadgeValue=" + damadgeValue +
                ", damadgeDesc='" + damadgeDesc + '\'' +
                ", finalTotal=" + finalTotal +
                ", rDetails='" + rDetails + '\'' +
                '}';
    }

    public int getPaymentID() {
        return paymentID;
    }

    public void setPaymentID(int paymentID) {
        this.paymentID = paymentID;
    }

    public double getAstimatTotal() {
        return astimatTotal;
    }

    public void setAstimatTotal(double astimatTotal) {
        this.astimatTotal = astimatTotal;
    }

    public double getExtraKM() {
        return extraKM;
    }

    public void setExtraKM(double extraKM) {
        this.extraKM = extraKM;
    }

    public double getPriceForExtraKM() {
        return priceForExtraKM;
    }

    public void setPriceForExtraKM(double priceForExtraKM) {
        this.priceForExtraKM = priceForExtraKM;
    }

    public double getDamadgeValue() {
        return damadgeValue;
    }

    public void setDamadgeValue(double damadgeValue) {
        this.damadgeValue = damadgeValue;
    }

    public String getDamadgeDesc() {
        return damadgeDesc;
    }

    public void setDamadgeDesc(String damadgeDesc) {
        this.damadgeDesc = damadgeDesc;
    }

    public double getFinalTotal() {
        return finalTotal;
    }

    public void setFinalTotal(double finalTotal) {
        this.finalTotal = finalTotal;
    }

    public String getrDetails() {
        return rDetails;
    }

    public void setrDetails(String rDetails) {
        this.rDetails = rDetails;
    }
}
