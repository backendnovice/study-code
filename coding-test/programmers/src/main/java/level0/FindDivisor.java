package level0;

import java.util.ArrayList;
import java.util.List;

public class FindDivisor {
    public int[] solution(int n) {
        List<Integer> result = new ArrayList<>();
        
        for(int i = 1; i <= n / 2; i++) {
            if(n % i == 0) result.add(i);
        }
        result.add(n);
        
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
