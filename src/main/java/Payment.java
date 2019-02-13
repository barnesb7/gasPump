public class Payment {

    private String paymentType;
    private double amountPayed;

    public Payment(String paymentType, double amountPayed){
        this.paymentType = paymentType;
        this.amountPayed = amountPayed;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public double getAmountPayed() {
        return amountPayed;
    }

    public void setAmountPayed(double amountPayed) {
        this.amountPayed = amountPayed;
    }
}
