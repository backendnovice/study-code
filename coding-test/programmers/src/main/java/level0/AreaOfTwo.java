package level0;

import java.util.Arrays;

public class AreaOfTwo {
    public int[] solution(int[] arr) {
        final int INDEX_LAST = arr.length - 1;
        int start = -1;
        int end = -1;
        
        for(int i = 0; i <= INDEX_LAST; i++) {
            if(arr[i] == 2) {
                start = i;
                break;
            }
        }
        
        if(start == -1) {
            return new int[]{-1};
        }
        
        for(int i = INDEX_LAST; i >= start; i--) {
            if(arr[i] == 2) {
                end = i;
                break;
            }
        }

        return (start == end) ? new int[]{arr[start]} : Arrays.copyOfRange(arr, start, end + 1);
    }
}
