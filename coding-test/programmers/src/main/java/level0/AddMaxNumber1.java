package level0;

import java.util.Arrays;

public class AddMaxNumber1 {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        
        final int LENGTH = numbers.length;
        final int RESULT_FRONT = numbers[0] * numbers[1];
        final int RESULT_BACK = numbers[LENGTH - 1] * numbers[LENGTH - 2];
        
        return Math.max(RESULT_FRONT, RESULT_BACK);
    }
}
