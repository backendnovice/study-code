package level0;

import java.util.Arrays;

public class StringSplitSort {
    public String[] solution(String myString) {
        String[] result = myString.split("x+");
    
        Arrays.sort(result);
        
        return Arrays.stream(result).filter(str -> !str.equals("")).toArray(String[]::new);
    }
}
