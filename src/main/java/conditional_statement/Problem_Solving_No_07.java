package conditional_statement;

import java.util.Scanner;

public class Problem_Solving_No_07 {

    // Write A Program To Show Multiplication Table Of Given Numbers
    public static void main(String[] args) {
        System.out.println("Input A Number: ");

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            int mul = number * i;
            System.out.println(number + "*" + i + "=" + mul);
        }
    }
}
