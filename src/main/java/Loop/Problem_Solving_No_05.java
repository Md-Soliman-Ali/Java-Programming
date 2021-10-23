package Loop;

import java.util.Scanner;

public class Problem_Solving_No_05 {

    public static void main(String[] args) {

        System.out.println("Input a number to find factorial: ");

        Scanner scanner = new Scanner(System.in);
        double num = scanner.nextDouble();

        double fact = 1;

        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        System.out.println(fact);
    }
}
