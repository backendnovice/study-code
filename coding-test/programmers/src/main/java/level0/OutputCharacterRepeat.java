package level0;

import java.util.stream.IntStream;

public class OutputCharacterRepeat {
    public String solution(String my_string, int n) {
        String[] array = my_string.split("");
        final int LENGTH = array.length;
        
        StringBuilder result = new StringBuilder();
        
        IntStream.range(0, LENGTH).forEach(i -> {
            IntStream.rangeClosed(1, n).forEach(j -> {
                result.append(array[i]);
            });
        });
        
        return result.toString();
    }
}
