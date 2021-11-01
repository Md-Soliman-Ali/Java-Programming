package function;

public class Calculation_Function {

    public static void main(String[] args) {

        // Calculation_Function obj = new Calculation_Function();

        // int sum = obj.Sum(10, 20);
        int sum = Sum(10, 20);
        System.out.println(sum);

        // double mul = obj.Multiply(10.5, 5);
        double mul = Multiply(10.5, 5);
        System.out.println(mul);
    }

    public static int Sum(int num1, int num2) {
        return num1 + num2;
    }

    public static double Multiply(double num1, int num2) {
        return num1 * num2;
    }
}
