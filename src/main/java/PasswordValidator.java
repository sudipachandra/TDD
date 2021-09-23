import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidator {

    public boolean matchWithValue(String _pattern,String _actualValue){
        Pattern pattern = Pattern.compile(_pattern);
        Matcher matcher = pattern.matcher(_actualValue);
        return matcher.find();
    }

    public Boolean haveSmallCharactars(String pass) {
        if(pass.isEmpty()){
            throw new RuntimeException("blank value");
        }
        return matchWithValue("[a-z]+",pass);
    }

    public Boolean haveCapitalCharactars(String pass) {
        return matchWithValue("[A-Z]+",pass);
    }

    public Boolean haveSpecialCharactars(String pass) {
        return matchWithValue("[^sa-zA-Z0-9]+",pass);
    }
}
