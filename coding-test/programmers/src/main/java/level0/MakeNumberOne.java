package level0;

public class MakeNumberOne {
    public int solution(int[] num_list) {
        int count = 0;
        
        for(int number : num_list) {
            while(number != 1) {
                number = (number % 2 == 0) ? number / 2 : (number - 1) / 2;
                count++;
            }
        }
        
        return count;
    }
}