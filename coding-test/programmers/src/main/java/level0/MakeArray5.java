package level0;

import java.util.ArrayList;
import java.util.List;

public class MakeArray5 {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> list = new ArrayList<>();
        
        for(String intStr : intStrs) {
            String string = intStr.substring(s, s + l);
            int number = Integer.parseInt(string);
            if(number > k) list.add(number);
        }
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
