package level0;

import java.math.BigInteger;

public class MarbleCaseNumber {
    public int solution(int balls, int share) {
        
        return factorial(balls).divide(factorial(balls - share).multiply(factorial(share))).intValue();
    }
    
    private BigInteger factorial(int number) {
        BigInteger result = new BigInteger("1");
        
        for(int i = number; i > 0; i--) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        
        return result;
    }
}
