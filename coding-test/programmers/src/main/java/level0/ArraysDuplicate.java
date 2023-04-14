package level0;

import java.util.Arrays;

public class ArraysDuplicate {
    public int solution(int[] array, int n) {
        return (int) Arrays.stream(array).filter(number -> number == n).count();
    }
}
