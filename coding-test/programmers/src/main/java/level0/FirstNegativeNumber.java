package level0;

import java.util.stream.IntStream;

public class FirstNegativeNumber {
    public int solution(int[] num_list) {
        final int LENGTH = num_list.length;
        
        return IntStream.range(0, LENGTH).filter(i -> num_list[i] < 0).findFirst().orElse(-1);
    }
}
