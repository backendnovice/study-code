package level0;

import java.util.Arrays;

public class CountDelimitByX {
    public int[] solution(String myString) {
        String[] array = myString.split("x", -1);
        
        return Arrays.stream(array).map(String::length).mapToInt(Integer::intValue).toArray();
    }
}
