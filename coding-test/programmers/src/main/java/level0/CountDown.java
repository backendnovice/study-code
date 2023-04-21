package level0;

import java.util.ArrayList;
import java.util.List;

public class CountDown {
    public int[] solution(int start, int end) {
        List<Integer> result = new ArrayList<>();
        
        for(int i = start; i >= end; i--) {
            result.add(i);
        }
        
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
