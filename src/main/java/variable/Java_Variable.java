package variable;

public class Java_Variable {

    static String profession = "Software Automation Engineer."; // static variable

    public static void main(String[] args) {
        String name = "Md. Soliman Ali."; // instance variable
        System.out.println("I am " + name + " I am a " + profession);
        experience();
    }

    static void experience() {
        int exp = 2; // local variable
        System.out.println("I have " + exp + " years of hands on experience.");
    }

}
