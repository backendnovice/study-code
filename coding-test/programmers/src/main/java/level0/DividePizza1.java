package level0;

public class DividePizza1 {
    public int solution(int n) {
        final int PIZZA_COUNT = 7;
        
        if(n % PIZZA_COUNT == 0)
            return n / PIZZA_COUNT;
        
        return (int)Math.ceil((double)n / PIZZA_COUNT);
    }
}
