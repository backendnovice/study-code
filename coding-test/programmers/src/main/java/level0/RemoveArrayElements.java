package level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveArrayElements {
    public int[] solution(int[] arr, int[] delete_list) {
        // Java 7 에서는 .toList()를 제공하지 않는다.
        // List<Integer> list = new ArrayList<>(Arrays.stream(arr).boxed().toList());
        // list.removeAll(Arrays.stream(delete_list).boxed().toList());
        
        List<Integer> list = new ArrayList<>(Arrays.stream(arr).boxed().collect(Collectors.toList()));
        
        List<Integer> template = new ArrayList<>(Arrays.stream(delete_list).boxed().collect(Collectors.toList()));
        
        list.removeAll(template);
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
