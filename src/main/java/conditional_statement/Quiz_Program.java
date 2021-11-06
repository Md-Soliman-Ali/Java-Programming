package conditional_statement;

import java.util.Scanner;

public class Quiz_Program {

    public static void main(String[] args) {

        int iteration = 5;
        int min = 10;
        int max = 99;

        int count = 1, score = 0;

        while (count <= 5) {
            double rand1 = Math.random() * (max - min) + min;
            double rand2 = Math.random() * (max - min) + min;

            int num1 = (int) rand1;
            int num2 = (int) rand2;

            System.out.println("Question " + count + ":\nWhat Is The Sum Of " + num1 + " And " + num2 + "?");

            Scanner scanner = new Scanner(System.in);
            int sum = scanner.nextInt();

            if (num1 + num2 == sum) {
                System.out.printf("Correct!\n");
                score++;
            } else {
                System.out.println("Wrong");
            }
            count++;
        }
        System.out.println("Quiz End! Your Total Score Is " + score + " Out Of " + iteration);
    }
}
