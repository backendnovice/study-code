package level1;

public class CalculateDeficientAmount {
    public long solution(int price, int money, int count) {
        long require = 0;
        for(int i = 1; i <= count; i++) {
            require += price * i;
        }
        
        return (require > money) ? require - money : 0;
    }
}
