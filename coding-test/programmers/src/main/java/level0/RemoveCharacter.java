package level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveCharacter {
    public String solution(String my_string, int[] indices) {
        List<String> list = new ArrayList<>(Arrays.asList(my_string.split("")));
        
        for(int index : indices) {
            list.set(index, "");
        }
        
        return String.join("", list);
    }
}
