package level0;

import java.util.Arrays;

public class CalculateByLength {
    public int solution(int[] num_list) {
        return (num_list.length >= 11) ? Arrays.stream(num_list).sum() : Arrays.stream(num_list).reduce((num1, num2) -> num1 * num2).stream().sum();
    }
}
