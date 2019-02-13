import java.util.Scanner;

public class GasPumpDemo
{

        public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

         GasPump gasPump = new GasPump();
         PaymentHandler paymentHandler = new PaymentHandler();
         UserMenu menu = new UserMenu();
         boolean running = true;

         Payment userPayment;
         Gas gasSelected;

         do {
             menu.showMainMenu();
             String userInput = sc.nextLine();

             if (userInput.equals("1")) {
                userPayment = paymentHandler.handlePrePayment(menu, sc);
                gasPump.run(userPayment, menu, sc);
             } else if (userInput.equals("2")) {
                 userPayment = paymentHandler.handlePaymentAtPump(menu, sc);
             } else if(userInput.equals("3")){
                 menu.showExitOption();
                 running = false;
             }

         }while(running);

        }
}
