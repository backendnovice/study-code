package level0;

import java.util.Arrays;

public class ConvertArrayByCondition1 {
    public int[] solution(int[] arr) {
        return Arrays.stream(arr)
                .map(num -> {
                    if(num >= 50 && num % 2 == 0) {
                        return num / 2;
                    }
                    if(num < 50 && num % 2 != 0) {
                        return num * 2;
                    }
                    return num;
                }).toArray();
    }
}
