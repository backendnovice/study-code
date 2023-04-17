package level0;

import java.util.Arrays;
import java.util.stream.Collectors;

public class DeleteDuplicateCharacter {
    public String solution(String my_string) {
        return Arrays.stream(my_string.split("")).distinct().collect(Collectors.joining());
    }
}
