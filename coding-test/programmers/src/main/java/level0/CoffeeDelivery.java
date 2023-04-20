package level0;

public class CoffeeDelivery {
    public int solution(String[] order) {
        int result = 0;
        
        for(String coffee : order) {
            result += (coffee.contains("americano") || coffee.contains("anything")) ? 4500 : 5000;
        }
        
        return result;
    }
}
