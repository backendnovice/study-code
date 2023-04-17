package level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ChangeStringIndex {
    public String solution(String my_string, int num1, int num2) {
        List<String> strings = new ArrayList<>(Arrays.asList(my_string.split("")));
        
        String temp = strings.set(num1, strings.get(num2));
        strings.set(num2, temp);
        
        return String.join("", strings);
    }
}
