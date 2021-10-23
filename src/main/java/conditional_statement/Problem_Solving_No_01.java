package conditional_statement;

import java.util.Scanner;

public class Problem_Solving_No_01 {

    public static void main(String[] args) {

        System.out.println("Please input a number to check if it is positive or negative: ");

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        if (number >= 0) {
            System.out.println(number + " : This is a positive Number");
        } else if (number < 0) {
            System.out.println(number + " : This is a negative Number");
        }
    }
}