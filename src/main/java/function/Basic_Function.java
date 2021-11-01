package function;

public class Basic_Function {

    public static void main(String[] args) {

        String check = check_Positive_Negative(-1);
        System.out.println(check);
    }

    public static String check_Positive_Negative(int num) {
        if (num > 0) {
            return "Positive";
        }
        return "Negative";
    }
}
