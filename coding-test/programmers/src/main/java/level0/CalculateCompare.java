package level0;

public class CalculateCompare {
    public int solution(int a, int b) {
        int number1 = Integer.parseInt(a + "" + b);
        int number2 = a * b * 2;
        
        return (number1 > number2) ? number1 : number2;
    }
}
