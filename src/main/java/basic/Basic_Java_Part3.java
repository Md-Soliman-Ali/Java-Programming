package basic;

import java.util.Scanner;

public class Basic_Java_Part3 {

    // Write A Program To Take 3 Inputs From User And Do Sum With Average
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input Number 1: ");
        double a = scanner.nextDouble();

        System.out.println("Input Number 2: ");
        double b = scanner.nextDouble();

        System.out.println("Input Number 3: ");
        double c = scanner.nextDouble();

        double sum = a + b + c;
        double avg = sum / 3;

        System.out.println("Sum is " + sum);
        System.out.println("Average is " + avg);
    }
}
