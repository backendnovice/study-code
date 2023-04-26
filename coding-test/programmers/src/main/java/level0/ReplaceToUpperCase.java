package level0;

import java.util.Locale;

public class ReplaceToUpperCase {
    public String solution(String my_string, String alp) {
        return my_string.replaceAll(alp, alp.toUpperCase(Locale.ROOT));
    }
}
