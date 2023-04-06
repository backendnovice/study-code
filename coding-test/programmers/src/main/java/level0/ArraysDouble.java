package level0;

import java.util.Arrays;

public class ArraysDouble {
    public int[] solution(int[] numbers) {
        final int DOUBLE = 2;
        
        return Arrays.stream(numbers).map(number -> number *= DOUBLE).toArray();
    }
}
