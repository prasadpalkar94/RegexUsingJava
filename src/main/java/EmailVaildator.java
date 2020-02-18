import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailVaildator {
    final static String email="";
    public boolean checkEmail(String email) {
        Pattern pattern = Pattern.compile("name");
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
}
