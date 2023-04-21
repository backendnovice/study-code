package level0;

import java.util.Arrays;

public class RemainderByNine {
    public int solution(String number) {
        return Arrays.stream(number.split("")).mapToInt(Integer::parseInt).sum() % 9;
    }
}
