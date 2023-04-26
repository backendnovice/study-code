package level0;

public class CompareConcatenatedNumber {
    public int solution(int a, int b) {
        int number1 = Integer.parseInt(a + "" + b);
        int number2 = Integer.parseInt(b + "" + a);
        
        return Math.max(number1, number2);
    }
}
