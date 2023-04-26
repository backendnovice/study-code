package level0;

import java.util.Arrays;

public class CompareSumMul {
    public int solution(int[] num_list) {
        int resultSum = (int)Math.pow(Arrays.stream(num_list).sum(), 2);
        int resultMul = Arrays.stream(num_list).reduce((a, b) -> a * b).getAsInt();
        
        return resultSum > resultMul ? 1 : 0;
    }
}
