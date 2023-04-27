package level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TailString {
    public String solution(String[] str_list, String ex) {
        List<String> list = new ArrayList<>(Arrays.asList(str_list));
        
        return list.stream().filter(str -> !str.contains(ex)).collect(Collectors.joining());
    }
}
