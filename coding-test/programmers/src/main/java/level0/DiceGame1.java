package level0;

public class DiceGame1 {
    public int solution(int a, int b, int c) {
        if(a != b && b != c && a != c) {
            return a + b + c;
        }else if(a == b && a == c) {
            return 3 * a
                    * 3 * power(a, 2)
                    * 3 * power(a, 3);
        }else {
            return (a + b + c)
                    * (power(a, 2) + power(b, 2) + power(c , 2));
        }
    }
    
    private int power(int number, int power) {
        int result = 1;
        
        for(int i = 1; i <= power; i++) {
            result *= number;
        }
        
        return result;
    }
}
