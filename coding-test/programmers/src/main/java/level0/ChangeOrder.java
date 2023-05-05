package level0;

import java.util.ArrayList;
import java.util.List;

public class ChangeOrder {
    public int[] solution(int[] num_list, int n) {
        final int LENGTH = num_list.length;
        
        List<Integer> list = new ArrayList<>();
        
        for(int i = n; i < LENGTH; i++) {
            list.add(num_list[i]);
        }
        
        for(int i = 0; i < n; i++) {
            list.add(num_list[i]);
        }
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
