package level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AccentA {
    public String solution(String myString) {
        List<String> list = new ArrayList<>(Arrays.asList(myString.split("")));
        
        for(int i = 0; i < list.size(); i++) {
            String string = list.get(i);
            if(string.equals("a") || string.equals("A")) {
                list.set(i, string.toUpperCase());
            }else {
                list.set(i, string.toLowerCase());
            }
        }
        
        return String.join("", list);
    }
}
