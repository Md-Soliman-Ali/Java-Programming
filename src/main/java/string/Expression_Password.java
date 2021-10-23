package string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Expression_Password {

    public static void main(String[] args) {

        boolean status = isValid("P@ssword123");
        System.out.println(status);
    }

    public static boolean isValid(String password) {
        String regex = "^(?=.*[0-9])"
                + "(?=.*[a-z])(?=.*[A-Z])"
                + "(?=.*[@#$%^&+=])"
                + "(?=\\S+$).{8,20}$";
        Pattern p = Pattern.compile(regex);
        if (password == null) {
            return false;
        }
        Matcher m = p.matcher(password);
        return m.matches();
    }
}
