package level0;

public class BacteriaGrowth {
    public int solution(int n, int t) {
        int result = n;
        
        for(int i = 1; i <= t; i++) {
            result *= 2;
        }
        
        return result;
    }
}
