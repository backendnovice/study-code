package level0;

import java.util.Arrays;

public class ThreeDelimiters {
    public String[] solution(String myStr) {
        String[] result = Arrays.stream(myStr.split("[a-c]+"))
                .filter(str -> !str.isEmpty())
                .toArray(String[]::new);
        
        return (result.length == 0) ? new String[]{"EMPTY"} : result;
    }
}
