package level1;

import java.util.Arrays;

public class HashadNumber {
    public boolean solution(int x) {
        int divisor = Arrays.stream(String.valueOf(x).split("")).mapToInt(Integer::parseInt).sum();
        
        return x % divisor == 0;
    }
}
