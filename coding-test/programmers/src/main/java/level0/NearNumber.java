package level0;

import java.util.Arrays;

public class NearNumber {
    public int solution(int[] array, int n) {
        Arrays.sort(array);
        
        int[] calculates = Arrays.stream(array).map(num -> Math.abs(num - n)).toArray();
        final int MIN = Arrays.stream(calculates).min().getAsInt();
        final int LENGTH = array.length;
        
        int result = 0;
        
        for(int i = 0; i < LENGTH; i++) {
            if(calculates[i] == MIN) {
                result = array[i];
                break;
            }
        }
        
        return result;
    }
}
