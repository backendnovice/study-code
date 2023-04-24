package level1;

import java.util.Arrays;

public class MakeDivisibleArray {
    public int[] solution(int[] arr, int divisor) {
        int[] result = Arrays.stream(arr).filter(e -> e % divisor == 0).toArray();
        return (result.length > 0) ? Arrays.stream(result).sorted().toArray() : new int[]{-1};
    }
}
