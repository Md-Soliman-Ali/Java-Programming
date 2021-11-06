package basic;

import java.util.Scanner;

public class Basic_Java_Part2 {

    // Write A Program To Convert Double Type Value To An Integer Type Value
    public static void main(String[] args) {
        System.out.println("Input A Double Type Number: ");
        Scanner scanner = new Scanner(System.in);

        double num = scanner.nextDouble();
        System.out.println("Converted To Int Type: " + (int) num);
    }
}
