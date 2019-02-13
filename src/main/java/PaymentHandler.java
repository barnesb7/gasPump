import java.util.Scanner;
public class PaymentHandler {

    public Payment handlePrePayment(UserMenu menu, Scanner sc) {

        String chosenPaymentType = " ";

        menu.showPrepayMenu();
        double userPaymentInput = sc.nextDouble();

        menu.showPaymentTypeMenu();
        int userOptionInput = sc.nextInt();
        sc.nextLine(); // clear scanner

        if (userOptionInput == 1) {
            chosenPaymentType = "cash";
        } else if (userOptionInput == 2) {
            chosenPaymentType = "card";
        }

        Payment userPayment = new Payment(chosenPaymentType, userPaymentInput);

        return userPayment;

    }

    public Payment handlePaymentAtPump(UserMenu menu, Scanner sc) {
        String chosenPaymentType = "";

        menu.showPayAtPumpMenu();
        String userPaymentInput = sc.nextLine();
        chosenPaymentType = "card";

        Payment userPayment = new Payment(chosenPaymentType,0);

        return userPayment;
    }

}


