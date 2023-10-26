package methods;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegexDemo {
    
    public static void main(String[] args){
        String regEx = "";
        String expression = "Java Lessons";

        Pattern pattern = Pattern.compile(regEx);
        Matcher matchExp = pattern.matcher(expression);

        boolean result = matchExp.matches();
        System.out.println(result);

    }

}
