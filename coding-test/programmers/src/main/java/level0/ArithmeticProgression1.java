package level0;

public class ArithmeticProgression1 {
    public int solution(int a, int d, boolean[] included) {
        int result = 0;
        
        for(int i = 0; i < included.length; i++) {
            if(included[i]) {
                result += d * i + a;
            }
        }
        
        return result;
    }
}
