package level0;

import java.util.ArrayList;
import java.util.List;

public class ArraysSplit {
    public String[] solution(String my_str, int n) {
        List<String> list = new ArrayList<>();
        
        final int STRING_LENGTH = my_str.length();
        
        for(int start = 0; start < STRING_LENGTH; start += n) {
            int end = (start + n >= STRING_LENGTH) ? my_str.length() :  start + n;
            
            list.add(my_str.substring(start, end));
        }
        
        return list.toArray(new String[list.size()]);
    }
}
