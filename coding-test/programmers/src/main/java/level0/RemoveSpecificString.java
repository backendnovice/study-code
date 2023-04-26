package level0;

import java.util.Arrays;

public class RemoveSpecificString {
    public String[] solution(String[] strArr) {
        final String SPECIFIC_STRING = "ad";
        
        return Arrays.stream(strArr).filter(str -> !str.contains(SPECIFIC_STRING)).toArray(String[]::new);
    }
}
