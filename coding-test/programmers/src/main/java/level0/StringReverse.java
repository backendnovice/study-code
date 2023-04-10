package level0;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StringReverse {
    public String solution(String my_string) {
        List<String> list = Arrays.asList(my_string.split(""));
        
        Collections.reverse(list);
        
        return String.join("", list);
    }
}
