package level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FromFiveBack {
    public int[] solution(int[] num_list) {
        List<Integer> list = new ArrayList<>();
        
        Arrays.sort(num_list);
        
        for(int i = 0; i < 5; i++) {
            list.add(num_list[i]);
        }
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
