package level0;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BeforeMakeAfter {
    public int solution(String before, String after) {
    
        return Stream.of(before.split("")).sorted().collect(Collectors.joining())
                .equals(Stream.of(after.split("")).sorted().collect(Collectors.joining())) ? 1 : 0;
    }
}
