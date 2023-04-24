package level1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NumberReverseOrder {
    public long solution(long n) {
        List<String> array = Arrays.asList(String.valueOf(n).split(""));
    
        Collections.sort(array, Collections.reverseOrder());
        
        return Long.parseLong(String.join("", array));
    }
}
