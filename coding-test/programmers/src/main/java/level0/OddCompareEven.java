package level0;

import java.util.Arrays;

public class OddCompareEven {
    public int solution(int[] num_list) {
        final int LENGTH = num_list.length;
        
        int sumEven = 0, sumOdd = 0;
        
        for(int i = 0; i < LENGTH; i++) {
            if(i % 2 == 0)
                sumEven += num_list[i];
            else
                sumOdd += num_list[i];
        }
        
        return Math.max(sumEven, sumOdd);
    }
}
