package level1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class DeleteMinimum {
    public int[] solution(int[] arr) {
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        
        if(list.size() > 1) {
            list.remove(list.indexOf(Collections.min(list)));
            return list.stream().mapToInt(Integer::intValue).toArray();
        }else {
            return new int[]{-1};
        }
    }
}
