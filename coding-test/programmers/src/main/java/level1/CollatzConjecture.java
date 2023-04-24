package level1;

public class CollatzConjecture {
    public int solution(int num) {
        if(num == 1) {
            return 0;
        }else {
            long number = num;
            int count = 0;
            
            while(count < 500) {
                if(number == 1) {
                    break;
                }else {
                    number = (number % 2 == 0) ? number / 2 : number * 3 + 1;
                    count++;
                }
            }
            return (count == 500) ? -1 : count;
        }
    }
}
