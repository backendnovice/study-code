package level0;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraysReverse {
    public int[] solution(int[] num_list) {
        List<Integer> list = Arrays.asList(Arrays.stream(num_list).boxed().toArray(Integer[]::new));
        
        Collections.reverse(list);
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
