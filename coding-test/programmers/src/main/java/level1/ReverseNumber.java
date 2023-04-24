package level1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseNumber {
    public int[] solution(long n) {
        List<String> numbers = Arrays.asList(String.valueOf(n).split(""));
        
        Collections.reverse(numbers);
        
        return numbers.stream().mapToInt(Integer::parseInt).toArray();
    }
}
