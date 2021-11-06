package basic;

import java.util.Scanner;

public class Basic_Java_Part5 {

    // Write A Program To Solve (a+b)^2
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input The Value Of A: ");
        int a = scanner.nextInt();

        System.out.println("Input The Value Of B: ");
        int b = scanner.nextInt();

        double res = Math.pow(a, 2) + 2 * a * b + Math.pow(b, 2);
        System.out.println((int) res);
    }
}
