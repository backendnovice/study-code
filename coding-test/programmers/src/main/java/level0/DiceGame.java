package level0;

public class DiceGame {
    public int solution(int a, int b) {
        boolean IS_A_ODD = a % 2 == 1;
        boolean IS_B_ODD = b % 2 == 1;
        
        int result = 0;
        
        if(IS_A_ODD) {
            result = (IS_B_ODD) ? (int)Math.pow(a, 2) + (int)Math.pow(b, 2) : 2 * (a + b);
        }else {
            result = (IS_B_ODD) ? 2 * (a + b) : Math.abs(a - b);
        }
        
        return result;
    }
}
