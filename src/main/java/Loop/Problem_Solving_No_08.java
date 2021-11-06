package Loop;

import java.util.Scanner;

public class Problem_Solving_No_08 {

    public static void main(String[] args) {
        System.out.println("Input A Number As A Range To See Prime Numbers: ");
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int count = 0;
        int j = 2;

        while (j <= n) {
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
            j++;
        }
        System.out.println("Total Prime Numbers From 2 To " + n + " is: " + count);
    }
}

