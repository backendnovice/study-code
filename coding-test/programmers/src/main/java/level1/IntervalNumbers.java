package level1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class IntervalNumbers {
    public long[] solution(int x, int n) {
        List<Long> result = new ArrayList<>();
    
        IntStream.rangeClosed(1, n).forEach(i -> result.add((long)x * i));
        
        return result.stream().mapToLong(i -> i).toArray();
    }
}
