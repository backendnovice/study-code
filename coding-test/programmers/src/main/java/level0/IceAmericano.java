package level0;

public class IceAmericano {
    public int[] solution(int money) {
        final int COST = 5500;
        
        int count = money / COST;
        int left = money % COST;
        
        return new int[] {count, left};
    }
}
