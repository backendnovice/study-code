package level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindStringChanged {
    public int solution(String myString, String pat) {
        List<String> list = new ArrayList<>(Arrays.asList(myString.split("")));
        
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i).equals("A")) {
                list.set(i, "B");
            }else {
                list.set(i, "A");
            }
        }
        
        return String.join("", list).contains(pat) ? 1 : 0;
    }
}
