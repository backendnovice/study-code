package level0;

import java.util.Arrays;

public class FindMedianNumber {
    public int solution(int[] array) {
        final int LENGTH_ARRAY = array.length;
        final int INDEX_MEDIAN = LENGTH_ARRAY / 2;
        
        Arrays.sort(array);
        
        return array[INDEX_MEDIAN];
    }
}
