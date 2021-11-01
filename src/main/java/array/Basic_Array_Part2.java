package array;

public class Basic_Array_Part2 {

    public static void main(String[] args) {

        // For Each Loop
        // Print All Elements From An Array
        String[] fruits = {"Mango", "Litchi", "Apple", "Banana"};
        for (String c : fruits) {
            System.out.println("I Like " + c);
        }

        int[] num = {10, 5, 2, 3, 2, 7, 7, 15, 10};
        //checkDuplicate(num);

        int pos = checkPosition(7, num);
        System.out.println(pos);
    }

    // Find The Duplicate Element In Array
    public static void checkDuplicate(int[] num) {
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < i; j++) {
                if (num[i] == num[j]) {
                    System.out.println(num[j]);
                }
            }
        }
    }

    // Find The Position From An Array
    public static int checkPosition(int num, int[] list) {
        for (int i = 0; i < list.length; i++) {
            if (num == list[i]) {
                return i;
            }
        }
        return -1;
    }
}
