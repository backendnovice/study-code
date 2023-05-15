package level0;

import java.util.Arrays;
import java.util.stream.Collectors;

public class AlienPlanet {
    public String solution(int age) {
        final String[] dictionary = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};
    
        return Arrays.stream(String.valueOf(age).split("")).map(str -> dictionary[Integer.parseInt(str)]).collect(Collectors.joining());
    }
}
