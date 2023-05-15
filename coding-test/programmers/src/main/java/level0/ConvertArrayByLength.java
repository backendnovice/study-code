package level0;

import java.util.stream.IntStream;

public class ConvertArrayByLength {
    public int[] solution(int[] arr, int n) {
        final int ARR_LENGTH = arr.length;
        
        return ARR_LENGTH % 2 == 0
                ? IntStream.range(0, ARR_LENGTH).map(i -> i % 2 != 0 ? arr[i] + n : arr[i]).toArray()
                : IntStream.range(0, ARR_LENGTH).map(i -> i % 2 == 0 ? arr[i] + n : arr[i]).toArray();
    }
}
