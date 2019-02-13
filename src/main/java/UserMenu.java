public class UserMenu {

    public void showMainMenu(){
        System.out.println("Welcome! Would you like to: \n" +
                            "[1] Prepay " +
                            "[2] Pay At Pump" +
                            "[3] Exit Gas Station");
    }

    public void showPrepayMenu(){
        System.out.println("How much would you like to pay?");
    }

    public void showPayAtPumpMenu(){
        System.out.println("Insert Card. Is this card:" +
                            "[1] Debit" +
                            "[2] Credit");
    }

    public void showGasOptionMenu(){
        System.out.println("Choose your gas:" +
                            "[1] Unleaded 87" +
                            "[2] Plus 89" +
                            "[3] Premium 93" +
                            "[4] Diesel");
    }

    public void showExitOption(){
        System.out.println("Thank you for visiting.");
    }

}
