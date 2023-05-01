package level0;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LeastTwoElements {
    public int[] solution(int[] num_list) {
        List<Integer> list = Arrays.stream(num_list).boxed().collect(Collectors.toList());
        
        final int NUM_LAST = num_list[num_list.length - 1];
        final int NUM_BEFORE = num_list[num_list.length - 2];
    
        list.add(NUM_LAST > NUM_BEFORE ? NUM_LAST - NUM_BEFORE : NUM_LAST * 2);
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
