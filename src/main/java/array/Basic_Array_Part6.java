package array;

import java.util.Arrays;
import java.util.Scanner;

public class Basic_Array_Part6 {

    // Find The Second Largest Number From An Array
    public static void main(String[] args) {

        int size = 10;
        int[] numbers = new int[size];

        System.out.println("Input Number: ");
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        Arrays.sort(numbers);
        int secondLargestNumber = numbers[numbers.length - 2];

        System.out.println(secondLargestNumber);
    }
}
