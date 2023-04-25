package level1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StringDescOrder {
    public String solution(String s) {
        List<String> list = Arrays.asList(s.split(""));
    
        Collections.sort(list, Collections.reverseOrder());
        
        return String.join("", list);
    }
}
