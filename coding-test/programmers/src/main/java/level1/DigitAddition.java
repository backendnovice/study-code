package level1;

import java.util.Arrays;

public class DigitAddition {
    public int solution(int n) {
        return Arrays.stream(String.valueOf(n).split("")).mapToInt(Integer::parseInt).sum();
    }
}
