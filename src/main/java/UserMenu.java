public class UserMenu {

    public void showMainMenu(){
        System.out.println("Welcome! Would you like to: \n" +
                            "[1] Prepay " +
                            "[2] Pay At Pump" +
                            "[3] Exit Gas Station");
    }

    public void showPrepayMenu(){
        System.out.println("How much would you like to pay? Please enter amount greater than $0.0.");
    }

    public void showPayAtPumpMenu(){
        System.out.println("Insert Card. Is this card:" +
                            "[1] Debit" +
                            "[2] Credit");
    }

    public void showGasOptionMenu(){
        System.out.println("Choose your gas:" +
                            "[1] Unleaded 87 $1.65" +
                            "[2] Plus 89 $2.43" +
                            "[3] Premium 93 $4.40");
    }

    public void showExitOption(){
        System.out.println("Thank you for visiting.");
    }

    public void showPaymentTypeMenu(){
        System.out.println("What type of payment is this prepayment: \n" +
                            "[1] Cash \n" +
                            "[2] Card");
    }

}
