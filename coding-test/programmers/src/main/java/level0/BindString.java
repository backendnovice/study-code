package level0;

import java.util.Arrays;
import java.util.stream.IntStream;

public class BindString {
    public int solution(String[] strArr) {
        int[] lenArr = Arrays.stream(strArr).map(String::length).mapToInt(Integer::intValue).toArray();
    
        return IntStream.rangeClosed(1, lenArr.length).map(i -> (int) Arrays.stream(lenArr).filter(j -> i == j).count()).max().getAsInt();
    }
}
