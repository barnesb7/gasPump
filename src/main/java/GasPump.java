import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class GasPump {

    DecimalFormat decimalFormat = new DecimalFormat("####.##");

    private Payment currentUserPayment;

    public void run(Payment userPayment, UserMenu menu, Scanner sc) {

    setCurrentUserPayment(userPayment);
    Gas userSelectedGas = selectGas(menu, sc);
    pumpGas(userSelectedGas, currentUserPayment);

    }

    public void pumpGas(Gas userSelectedGas, Payment currentUserPayment){
        if(currentUserPayment.getAmountPayed()== 0.0 && currentUserPayment.getPaymentType().equals("card")){
            //pump until they choose to stop
            //stop pumping if prepay is 0

        } else if(currentUserPayment.getAmountPayed() > 0.0){
            //do stuff here


            double priceOnPump = 0.0;
            double gallonsOnPump = 0.0;

            do {
                System.out.print("Price: " + decimalFormat.format(priceOnPump) + " || Gallons: " + decimalFormat.format(gallonsOnPump) + "\r");

                try {
                    TimeUnit.MICROSECONDS.sleep(2);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                priceOnPump += userSelectedGas.getPrice()/100;
                gallonsOnPump += .01;

            }while(priceOnPump < currentUserPayment.getAmountPayed());

        System.out.println("Final Price: " + currentUserPayment.getAmountPayed() + " || Final Gallons: " + decimalFormat.format(gallonsOnPump));
        }
    }


    private Gas selectGas(UserMenu menu, Scanner sc) {
        String typeOfGas = " ";
        double priceOfGas = 0.0;
        boolean invalidOption = true;

       do {
           menu.showGasOptionMenu();
           String gasSelected = sc.nextLine();

           if (gasSelected.equals("1")) {
               typeOfGas = "unleaded";
               priceOfGas = 1.65;
               invalidOption = false;
           } else if (gasSelected.equals("2")) {
               typeOfGas = "plus";
               priceOfGas = 2.43;
               invalidOption = false;
           } else if (gasSelected.equals("3")) {
               typeOfGas = "premium";
               priceOfGas = 4.40;
               invalidOption = false;
           } else {
               System.out.println("Please selected a valid option");
           }
       }while(invalidOption);

        return new Gas(typeOfGas, priceOfGas);
    }


    public Payment getCurrentUserPayment() {
        return currentUserPayment;
    }

    public void setCurrentUserPayment(Payment currentUserPayment) {
        this.currentUserPayment = currentUserPayment;
    }
}