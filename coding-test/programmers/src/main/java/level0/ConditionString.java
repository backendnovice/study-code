package level0;

public class ConditionString {
    public int solution(String ineq, String eq, int n, int m) {
        if(eq.equals("=")) {
            return ((ineq.equals(">")) ? n >= m : n <= m) ? 1 : 0;
        }else {
            return ((ineq.equals(">")) ? n > m : n < m) ? 1 : 0;
        }
    }
}
