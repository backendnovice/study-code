package level0;

public class DividePizza2 {
    public int solution(int n) {
        final int COUNT = 6;
        
        int number = (n > COUNT) ? euclideanAlgorithm(n, COUNT) : euclideanAlgorithm(COUNT, n);
        
        return n / number;
    }
    
    public static int euclideanAlgorithm(int high, int low) {
        if(low == 0)
            return high;
        else
            return euclideanAlgorithm(low, high % low);
    }
}
