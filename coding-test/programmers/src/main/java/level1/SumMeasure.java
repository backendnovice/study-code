package level1;

import java.util.stream.IntStream;

public class SumMeasure {
    public int solution(int n) {
        return IntStream.rangeClosed(1, n).filter(i -> n % i == 0).sum();
    }
}
