import java.util.Scanner;

public class Bt2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter deposit amount (VND): ");
        double money = scanner.nextDouble();


        System.out.println("Choose deposit term (6, 9, 12, 24, 36 months): ");
        int term = scanner.nextInt();


        double interestRate;
        String termDisplay;

        switch (term) {
            case 6:
                interestRate = 5.1;
                termDisplay = "6 months";
                break;
            case 9:
                interestRate = 5.5;
                termDisplay = "9 months";
                break;
            case 12:
                interestRate = 6.4;
                termDisplay = "12 months";
                break;
            case 24:
                interestRate = 6.5;
                termDisplay = "24 months";
                break;
            case 36:
                interestRate = 6.5;
                termDisplay = "36 months";
                break;
            default:
                System.out.println("Invalid term!");
                return;
        }


        double interest = money * (interestRate / 100);


        double totalAmount = money + interest;


        System.out.printf("Amount: %.0f VND, Term: %s, Deposit Type: VND, Interest for the term: %.0f VND, Money + Interest: %.0f VND/n",
                money, termDisplay, interest, totalAmount);

        scanner.close();
    }
}
