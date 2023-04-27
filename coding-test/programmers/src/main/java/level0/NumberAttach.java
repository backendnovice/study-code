package level0;

public class NumberAttach {
    public int solution(int[] num_list) {
        StringBuilder numberOdd = new StringBuilder();
        StringBuilder numberEven = new StringBuilder();
        
        for(int number : num_list) {
            if(number % 2 == 0) {
                numberEven.append(number);
            }else {
                numberOdd.append(number);
            }
        }
        
        return Integer.parseInt(numberOdd.toString()) + Integer.parseInt(numberEven.toString());
    }
    
}
