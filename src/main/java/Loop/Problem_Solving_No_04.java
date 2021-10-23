package Loop;

public class Problem_Solving_No_04 {

    public static void main(String[] args) {

      /*  int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);  */

        int sum = 0;
        for (int i = 0; i <= 100; i += 5) {
            sum += i;
        }
        System.out.println(sum);
    }
}
