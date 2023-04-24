package level1;

import java.util.Arrays;

public class NonExistAddition {
    public int solution(int[] numbers) {
        int TOTAL = 45;
    
        return TOTAL - Arrays.stream(numbers).sum();
    }
}
