package level0;

import java.util.stream.IntStream;

public class FindInteger {
    public int solution(int[] num_list, int n) {
        return IntStream.of(num_list).anyMatch(i -> i == n) ? 1 : 0;
    }
}
