package level0;

import java.util.Arrays;

public class SevenCount {
    public int solution(int[] array) {
        return (int) Arrays.stream(Arrays.toString(array).split("")).filter(num -> num.equals("7")).count();
    }
}
