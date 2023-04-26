package level0;

import java.util.Arrays;

public class StringDigitsAddition {
    public int solution(String num_str) {
        return Arrays.stream(num_str.split("")).mapToInt(Integer::parseInt).sum();
    }
}
