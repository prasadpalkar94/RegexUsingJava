import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class UserRegistration {
    final static String name="^[A-Z]{1}[A-Za-z]{3,}$";
    final static String email=
    public boolean checkFirstName(String firstName) {
        Pattern pattern = Pattern.compile(name);
        Matcher matcher = pattern.matcher(firstName);
        return matcher.matches();
    }

    public static boolean checkLastName(String lastName) {
        Pattern pattern = Pattern.compile(name);
        Matcher matcher = pattern.matcher(lastName);
        return matcher.matches();
    }

    public static boolean checkLastName(String email) {
        Pattern pattern = Pattern.compile(name);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }






}
