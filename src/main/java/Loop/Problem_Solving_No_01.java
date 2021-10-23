package Loop;

public class Problem_Solving_No_01 {

    public static void main(String[] args) {

      /*  for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }
        System.out.println();

        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
        System.out.println();  */

        for (int i = 10; i >= 1; i--) {
            if (i == 5) {
                continue;
            }
            System.out.println(i);
        }
        System.out.println();

        for (int i = 10; i >= 1; i--) {
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }
    }
}
