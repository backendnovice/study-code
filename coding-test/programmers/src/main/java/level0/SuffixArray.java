package level0;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SuffixArray {
    public String[] solution(String my_string) {
        final int FINAL_INDEX = my_string.length() - 1;
        
        List<String> result = new ArrayList<>();
        
        for(int i = FINAL_INDEX; i >= 0; i--) {
            result.add(my_string.substring(i));
        }
        
        result.sort(Comparator.naturalOrder());
        
        return result.toArray(new String[0]);
    }
}
