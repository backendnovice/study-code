package level0;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BehindFive {
    public int[] solution(int[] num_list) {
        Arrays.sort(num_list);
        
        List<Integer> result = Arrays.stream(num_list).boxed().collect(Collectors.toList());
        
        for(int i = 0; i < 5; i++) {
            result.remove(0);
        }
        
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
