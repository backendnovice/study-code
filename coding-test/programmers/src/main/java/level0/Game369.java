package level0;

import java.util.Arrays;

public class Game369 {
    public int solution(int order) {
        String[] strings = String.valueOf(order).split("");
        
        return (int) Arrays.stream(strings).filter(str -> "369".contains(str)).count();
    }
}
