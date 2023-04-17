package level0;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FindMaxNumber {
    public int[] solution(int[] array) {
        List<Integer> list = Arrays.stream(array).boxed().collect(Collectors.toList());
        
        int max = Collections.max(list);
        
        return new int[]{max, list.indexOf(max)};
    }
}
