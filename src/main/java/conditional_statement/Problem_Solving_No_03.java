package conditional_statement;

import java.util.Scanner;

public class Problem_Solving_No_03 {

    public static void main(String[] args) {

        System.out.println("Please input a character: ");

        Scanner scanner = new Scanner(System.in);

        char ch = scanner.next().charAt(0);

        if ((ch >= 'A') && (ch <= 'Z')) {
            System.out.println(ch + " : Capital Letter");
        } else if ((ch >= 'a') && (ch <= 'z')) {
            System.out.println(ch + " : Small Letter");
        } else {
            System.out.println(ch + " : Number or special character");
        }
    }
}
