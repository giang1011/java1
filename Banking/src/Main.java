import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the amount to withdraw (multiple of 50,000): ");
        int money = scanner.nextInt();


        int originalAmount = money;


        if (money % 50000 != 0) {
            System.out.println("The amount must be a multiple of 50,000 VND.");
        } else {

            int count500 = 0, count200 = 0, count100 = 0, count50 = 0;


            if (money >= 500000) {
                count500 = money / 500000;
                money %= 500000;
            }


            if (money >= 200000) {
                count200 = money / 200000;
                money %= 200000;
            }


            if (money >= 100000) {
                count100 = money / 100000;
                money %= 100000;
            }


            if (money >= 50000) {
                count50 = money / 50000;
            }


            int totalNotes = count500 + count200 + count100 + count50;


            System.out.println("Money withdrawal result:");
            System.out.printf("Amount: %d, 500k bills: %d, 200k bills: %d, 100k bills: %d, 50k bills: %d, Total bills: %d\n",
                    originalAmount, count500, count200, count100, count50, totalNotes);
        }

        scanner.close();
    }
}
