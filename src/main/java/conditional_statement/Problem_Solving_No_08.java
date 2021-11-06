package conditional_statement;

import java.util.Scanner;

public class Problem_Solving_No_08 {

    // Write A Program To Print Prime Numbers
    public static void main(String[] args) {

        System.out.println("Input A Number As A Range To See Prime Numbers: ");
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int count = 0;

        for (int j = 2; j < n; j++) {
            boolean flag = true;
            for (int i = 2; i <= j / 2; i++) {
                if (j % i == 0) {
                    flag = false;
                    break;
                }
            }

            if (flag == true) {
                System.out.println(j);
                count++;
            }
        }
        System.out.println("Total Prime Numbers From 2 to " + n + " is: " + count);

    }
}
