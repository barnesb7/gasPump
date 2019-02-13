import java.util.Scanner;

public class GasPumpDemo
{

        public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

         PaymentHandler paymentHandler = new PaymentHandler();
         UserMenu menu = new UserMenu();
         boolean running = true;

         Payment userPayment;

         do {
             menu.showMainMenu();
             String userInput = sc.nextLine();

             if (userInput.equals("1")) {
                userPayment = paymentHandler.handlePrePayment(menu, sc);

                 System.out.println("After creating prepayment: " + userPayment.getAmountPayed() + " " + userPayment.getPaymentType());
             } else if (userInput.equals("2")) {
                 userPayment = paymentHandler.handlePaymentAtPump(menu, sc);
                 System.out.println("After creating pay at pump: " + userPayment.getAmountPayed() + " " + userPayment.getPaymentType());
             } else if(userInput.equals("3")){
                 menu.showExitOption();
                 running = false;
             }

         }while(running);

        }
}
