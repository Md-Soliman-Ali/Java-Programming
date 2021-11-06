package array;

public class Basic_Array_Part7 {

    // Write A Program To Show The Duplicates Values
    public static void main(String[] args) {
        int[] numbers = {10, 5, 2, 3, 2, 7, 7, 15, 10};
        findDuplicates(numbers);
    }

    public static void findDuplicates(int[] num) {
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < i; j++) {
                if (num[i] == num[j]) {
                    System.out.println(num[i]);
                }
            }
        }
    }
}
