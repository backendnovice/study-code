package level0;

import java.util.ArrayList;
import java.util.List;

public class ElementsLength {
    public int[] solution(String[] strlist) {
        List<Integer> sizes = new ArrayList<>();
    
        for(String str : strlist) {
            sizes.add(str.length());
        }
        
        return sizes.stream().mapToInt(Integer::intValue).toArray();
    }
}
