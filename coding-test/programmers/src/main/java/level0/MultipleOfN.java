package level0;

import java.util.Arrays;

public class MultipleOfN {
    public int[] solution(int n, int[] numlist) {
        return Arrays.stream(numlist).filter(num -> num % n == 0).toArray();
    }
}
