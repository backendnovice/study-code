package level0;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringSort2 {
    public String solution(String my_string) {
        return Stream.of(my_string.toLowerCase().split("")).sorted().collect(Collectors.joining());
    }
}
