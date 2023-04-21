package level1;

import java.util.stream.IntStream;

public class RemainderIsOne {
    public int solution(int n) {
        return IntStream.range(1, n).filter(i -> n % i == 1).findFirst().getAsInt();
    }
}
