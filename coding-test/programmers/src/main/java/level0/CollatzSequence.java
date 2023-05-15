package level0;

import java.util.ArrayList;
import java.util.List;

public class CollatzSequence {
    public int[] solution(int n) {
        List<Integer> result = new ArrayList<>();
        
        result.add(n);
        
        int index = 0;
        while(true) {
            int value = result.get(index);
            
            if(value == 1) {
                break;
            }
            
            if(value % 2 == 0) {
                result.add(value / 2);
            }else {
                result.add(value * 3 + 1);
            }
            
            index++;
        }
        
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
