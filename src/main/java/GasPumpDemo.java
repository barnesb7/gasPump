import java.util.Scanner;

public class GasPumpDemo
{

        public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

         PrepaymentHandler prepaymentHandler = new PrepaymentHandler();
         UserMenu menu = new UserMenu();
         boolean running = true;

         do {
             menu.showMainMenu();
             String userInput = sc.nextLine();

             if (userInput.equals("1")) {
                 prepaymentHandler.handlePayment(menu);
             } else if (userInput.equals("2")) {
                 menu.showPayAtPumpMenu();
             } else if(userInput.equals("3")){
                 menu.showExitOption();
                 running = false;
             }

         }while(running);

        }
}
