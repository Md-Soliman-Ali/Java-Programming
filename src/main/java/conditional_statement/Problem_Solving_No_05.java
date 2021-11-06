package conditional_statement;

import java.util.Scanner;

public class Problem_Solving_No_05 {

    // Write A Program That Takes Year From User And Print Leap Year Or Not
    public static void main(String[] args) {
        System.out.println("Please Enter An Year To Check If It Is Leap Year Or Not: ");

        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("This Is A Leap Year");
                } else {
                    System.out.println("This Is Not Leap Year");
                }
            } else {
                System.out.println("This Is A Leap Year");
            }
        } else {
            System.out.println("This Is Not Leap Year");
        }
    }
}
