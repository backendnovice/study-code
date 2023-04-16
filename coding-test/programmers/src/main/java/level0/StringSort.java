package level0;

import java.util.ArrayList;
import java.util.List;

public class StringSort {
    public int[] solution(String my_string) {
        char[] characters = my_string.toCharArray();
    
        List<Integer> list = new ArrayList<>();
        
        for(Character character : characters) {
            if(Character.isDigit(character))
                list.add(Character.getNumericValue(character));
        }
        
        return list.stream().sorted().mapToInt(Integer::intValue).toArray();
    }
}
