package array;

public class Basic_Array_Part8 {

    // Write A Program To Find The Position Of A Matched Value From An Array
    public static void main(String[] args) {
        int[] numbers = {10, 5, 2, 3, 2, 7, 7, 15, 10};
        System.out.println(checkIfExists(4, numbers));
    }

    public static int checkIfExists(int num, int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            if (num == numbers[i]) {
                return i;
            }
        }
        return -1;
    }
}
