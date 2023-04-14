package level0;

import java.util.Arrays;

public class AddMaxNumber {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        
        return numbers[numbers.length - 1] * numbers[numbers.length - 2];
    }
}
