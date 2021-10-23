package string;

public class String_Methods {

    public static void main(String[] args) {

        String myVar = "Hello World";
        String myVar2 = " Farah";
        String myVar3 = " Java World ";

        System.out.println(myVar.charAt(0));

        System.out.println(myVar.indexOf("o"));

        System.out.println(myVar.length());

        System.out.println(myVar.contains(myVar2));

        System.out.println(myVar.replace("World", "Java"));

        System.out.println(myVar.concat(myVar2));

        System.out.println(myVar.startsWith("H"));

        String price = "56.123";
        String[] words = price.split("\\.");
        System.out.println(words[0]);

        System.out.println(myVar.substring(1, 7));

        System.out.println(myVar.toLowerCase());

        System.out.println(myVar.toUpperCase());

        // remove space
        System.out.println(myVar3.trim());

        double num = 15.559784;
        System.out.println(String.format("%.2f", num));

    }
}
