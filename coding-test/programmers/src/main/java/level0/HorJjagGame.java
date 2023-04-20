package level0;

public class HorJjagGame {
    public int solution(int n) {
        int result = 0;
        
        if(n % 2 == 0) {
            for(int i = 1; i <= n; i++) {
                result += (i % 2 == 0) ? Math.pow(i, 2) : 0;
            }
        }else {
            for(int i = 1; i <= n; i++) {
                result += (i % 2 != 0) ? i : 0;
            }
        }
        
        return result;
    }
}
