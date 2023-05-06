package level0;

import java.util.Arrays;

public class SumHiddenNumber2 {
    public int solution(String my_string) {
        return Arrays.stream(my_string.split("[a-zA-Z]+"))
                .filter(str -> !str.isEmpty())
                .mapToInt(Integer::parseInt)
                .sum();
    }
}
