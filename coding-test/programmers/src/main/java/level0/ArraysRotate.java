package level0;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArraysRotate {
    public int[] solution(int[] numbers, String direction) {
        List<Integer> list = Arrays.stream(numbers).boxed().collect(Collectors.toList());
        
        if(direction.equals("left")) {
            int temp = list.remove(0);
            list.add(temp);
        }
        if(direction.equals("right")) {
            int temp = list.remove(list.size() - 1);
            list.add(0, temp);
        }
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
