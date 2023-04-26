package level0;

import java.util.Arrays;
import java.util.List;

public class ExchangeUpperLowerCase {
    public String[] solution(String[] strArr) {
        List<String> list = Arrays.asList(strArr);
        
        for(int i = 0; i < list.size(); i++) {
            if(i % 2 == 0) {
                list.set(i, list.get(i).toLowerCase());
            }else {
                list.set(i, list.get(i).toUpperCase());
            }
        }
        
        return list.toArray(new String[0]);
    }
}
