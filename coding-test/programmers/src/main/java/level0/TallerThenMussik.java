package level0;

import java.util.Arrays;

public class TallerThenMussik {
    public int solution(int[] array, int height) {
        return (int) Arrays.stream(array).filter(student -> student > height).count();
    }
}
