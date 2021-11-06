package conditional_statement;

import java.util.Scanner;

public class ATM_Booth {

    // Write A Program To Check Balance And Withdraw Money From ATM Booth

    public static void main(String[] args) {
        int PIN = 4321;
        double balance = 5000;

        System.out.println("1. Check Balance");
        System.out.println("2. Withdraw Balance");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                int count = 0;
                for (int i = 1; i <= 3; i++) {
                    System.out.println("Enter Your PIN");
                    int pin = scanner.nextInt();

                    if (PIN == pin) {
                        System.out.println("Balance Is " + balance + " Tk");
                        break;
                    } else {
                        System.out.println("Wrong PIN Inserted");
                    }
                    count++;

                }
                if (count >= 3) {
                    System.out.println("You Have Entered Wrong PIN More Than 3 Times. Card Has Blocked.");
                }
                break;

            case 2:
                count = 0;
                for (int i = 1; i <= 3; i++) {
                    System.out.println("Enter Your PIN");
                    int pin = scanner.nextInt();

                    if (PIN == pin) {
                        System.out.println("Input Amount");
                        int amount = scanner.nextInt();

                        if (amount <= balance && amount % 500 == 0) {
                            balance -= amount;
                            System.out.println("Withdraw Successful. Your Current Balance Is " + balance + " Tk");
                            break;
                        } else if (amount > balance) {
                            System.out.println("Not Enough Balance. Please Input Valid Amount");
                        } else {
                            System.out.println("Try With Another Amount");
                        }
                    } else if (PIN != pin) {
                        System.out.println("Wrong PIN Inserted");
                    } else if (count >= 3) {
                        System.out.println("You Have Entered Wrong PIN More Than 3 Times. Card Has Blocked.");
                    }
                    count++;

                }
                if (count >= 3) {
                    System.out.println("You Have Entered Wrong PIN More Than 3 Times. Card Has Blocked.");
                }
                break;
            default:
                System.out.println("Please Select Option Either 1 or 2");
        }
    }
}
