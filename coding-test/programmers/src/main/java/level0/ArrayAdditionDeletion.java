package level0;

import java.util.ArrayList;
import java.util.List;

public class ArrayAdditionDeletion {
    public int[] solution(int[] arr, boolean[] flag) {
        final int LENGTH = arr.length;
    
        List<Integer> result = new ArrayList<>();
        
        for(int i = 0; i < LENGTH; i++) {
            int limit = 0;
            if(flag[i]) {
                limit = arr[i] * 2;
                for(int j = 0; j < limit; j++) {
                    result.add(arr[i]);
                }
            }else {
                limit = arr[i];
                for(int j = 0; j < limit; j++) {
                    result.remove(result.size() - 1);
                }
            }
        }
        
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
