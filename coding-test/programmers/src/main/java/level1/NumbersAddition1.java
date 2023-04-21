package level1;

import java.util.stream.LongStream;

public class NumbersAddition1 {
    public long solution(int a, int b) {
        return (a > b) ? LongStream.rangeClosed(b, a).sum() : LongStream.rangeClosed(a, b).sum();
    }
}
