package level1;

public class InnerProduct {
    public int solution(int[] a, int[] b) {
        final int LENGTH = a.length;
        
        int result = 0;
        for(int i = 0; i < LENGTH; i++) {
            result += a[i] * b[i];
        }
        
        return result;
    }
}
