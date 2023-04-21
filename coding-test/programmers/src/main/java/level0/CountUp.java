package level0;

import java.util.stream.IntStream;

public class CountUp {
    public int[] solution(int start, int end) {
        return IntStream.rangeClosed(start, end).toArray();
    }
}
