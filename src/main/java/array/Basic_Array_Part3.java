package array;

import java.util.Arrays;

public class Basic_Array_Part3 {

    public static void main(String[] args) {

        // Find The Sum Of All Elements From A Given Array
      /*  int[] num = {21, 20, 10, 41, 50};
        int sum = 0;

        for (int i = 0; i < num.length; i++) {
            sum += num[i];
        }
        System.out.println(sum);
    }  */

        // Find The Sum Of Even Numbers From A Given Array
        int[] num = {21, 20, 10, 41, 50};
        int sum = 0;

        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 == 0) {
                sum += num[i];
            }
        }
        System.out.println(sum);
        System.out.println();
        doSort(num);
    }

    // Sort Numbers In Ascending From An Array
    public static void doSort(int[] num) {
        Arrays.sort(num);
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
    }
}

