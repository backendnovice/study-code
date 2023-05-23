package level1;

import java.util.stream.IntStream;

public class IHateEquals {
    public int[] solution(int[] arr) {
        final int LENGTH = arr.length;
        
        return IntStream.range(0, LENGTH)
                .filter(i -> i == 0 || arr[i - 1] != arr[i])
                .map(i -> arr[i])
                .toArray();
    }
}
