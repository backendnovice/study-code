package level0;

import java.util.stream.IntStream;

public class SumEvenNumbers {
    public int solution(int n) {
        return IntStream.rangeClosed(1, n).filter(i -> i % 2 == 0).sum();
    }
}
