package level0;

public class LambSkewers {
    public int solution(int n, int k) {
        final int LAMB = 12000;
        final int DRINK = 2000;
        final int SERVICE = (n >= 10) ? n / 10 * DRINK : 0;
        
        return LAMB * n + DRINK * k - SERVICE;
    }
}
