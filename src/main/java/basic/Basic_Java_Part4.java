package basic;

import java.util.Scanner;

public class Basic_Java_Part4 {

    // Write A Program To Generate Random Numbers From Minimum Range To Maximum Range
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input Min Range: ");
        int min = scanner.nextInt();

        System.out.println("Input Max Range: ");
        int max = scanner.nextInt();

        double random_number = Math.random() * (max - min) + min;
        System.out.println((int) random_number);
    }
}
