package level0;

import java.util.Arrays;

public class ConvertArrayByCondition3 {
    public int[] solution(int[] arr, int k) {
        return k % 2 == 0
                ? Arrays.stream(arr).map(num -> num + k).toArray()
                : Arrays.stream(arr).map(num -> num * k).toArray();
    }
}
