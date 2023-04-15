package level0;

public class NumbersSquare {
    public int solution(int n) {
        Double result = Math.sqrt(n);
        
        return (result == result.intValue()) ? 1 : 2;
    }
}
