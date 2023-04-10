package level0;

public class CountEvenOdd {
    public int[] solution(int[] num_list) {
        int countEven = 0;
        int countOdd = 0;
        
        for(int number : num_list) {
            if(number % 2 == 0)
                countEven++;
            else
                countOdd++;
        }
        
        return new int[]{countEven, countOdd};
    }
}
