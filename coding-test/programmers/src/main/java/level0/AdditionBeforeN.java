package level0;

public class AdditionBeforeN {
    public int solution(int[] numbers, int n) {
        int result = 0;
        
        for(int number : numbers) {
            if(result > n) {
                break;
            }else {
                result += number;
            }
        }
        
        return result;
    }
}
