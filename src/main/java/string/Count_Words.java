package string;

public class Count_Words  {

    public static void main(String[] args) {

        String myStr = "this is my country";

        // count string length
        System.out.println(myStr.length());

        // count word length
        String[] str = myStr.split(" ");
        System.out.println(str.length);
    }
}
