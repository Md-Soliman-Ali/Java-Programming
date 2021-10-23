package Loop;

public class Problem_Solving_No_03 {

    public static void main(String[] args) {

      /*  int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println(sum); */

        int sum = 0;
        for (int i = 2; i <= 100; i+=2) {
            sum += i;
        }
        System.out.println(sum);
    }
}
