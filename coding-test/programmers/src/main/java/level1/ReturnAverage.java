package level1;

import java.util.Arrays;

public class ReturnAverage {
    public double solution(int[] arr) {
        return Arrays.stream(arr).average().orElse(0);
    }
}
