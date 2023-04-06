package level0;

import java.util.stream.Stream;

public class FractionsAddition {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int numerator = numer1 * denom2 + numer2 * denom1;
        int denominator = denom1 * denom2;
        
        int divisor = (numerator > denominator)
                ? euclideanAlgorithm(numerator, denominator) : euclideanAlgorithm(denominator, numerator);
        
        numerator /= divisor;
        denominator /= divisor;
        
        return new int[] {numerator, denominator};
    }
    
    public static int euclideanAlgorithm(int high, int low) {
        if(low == 0)
            return high;
        else
            return euclideanAlgorithm(low, high % low);
    }
}
