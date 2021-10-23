package Loop;

public class Problem_Solving_No_06 {

    public static void main(String[] args) {

        int number = 14;
        boolean flag = true;

        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                flag = false;
                System.out.println("Not prime");
                break;
            }
        }

        if (flag == true) {
            System.out.println("Prime");
        }
    }
}
