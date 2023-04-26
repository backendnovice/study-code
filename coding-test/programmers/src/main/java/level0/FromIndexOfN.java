package level0;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class FromIndexOfN {
    public int[] solution(int[] num_list, int n) {
        List<Integer> list = new ArrayList<>();
    
        final int LENGTH = num_list.length;
        IntStream.range(n - 1, LENGTH).forEach(i -> list.add(num_list[i]));
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
