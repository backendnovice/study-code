package level0;

public class Factorial {
    public int solution(int n) {
        int number = 1;
        int multiplier = 1;
        
        while(true) {
            if(number == n) {
                break;
            }
            if(number > n) {
                multiplier--;
                break;
            }
            
            multiplier++;
            number *= multiplier;
        }
        
        return multiplier;
    }
}
