package level0;

import java.util.Arrays;

public class ArraysCompare {
    public int solution(int[] arr1, int[] arr2) {
        final int LENGTH1 = arr1.length;
        final int LENGTH2 = arr2.length;
        
        if(LENGTH1 != LENGTH2) {
            return LENGTH1 > LENGTH2 ? 1 : -1;
        }else {
            int temp = Arrays.stream(arr1).sum() - Arrays.stream(arr2).sum();
            return (temp == 0) ? 0 : (temp > 0) ? 1 : -1;
        }
    }
}
