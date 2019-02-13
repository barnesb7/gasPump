public class Payment {

    private String paymentType;
    private double amountPaid;

    public Payment(String paymentType, double amountPaid){
        this.paymentType = paymentType;
        this.amountPaid = amountPaid;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public double getAmountPayed() {
        return amountPaid;
    }

    public void setAmountPayed(double amountPaid) {
        this.amountPaid = amountPaid;
    }
}
