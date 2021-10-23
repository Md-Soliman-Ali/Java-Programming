package Loop;

public class Problem_Solving_No_07 {

    public static void main(String[] args) {

        int number = 8572, reverse = 0;
        while (number != 0) {
            int remainder = number % 10;
            number = number / 10;
            reverse = reverse * 10 + remainder;
        }
        System.out.println(reverse);
    }
}
