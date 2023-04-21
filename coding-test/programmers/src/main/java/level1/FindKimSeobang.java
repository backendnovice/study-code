package level1;

import java.util.Arrays;

public class FindKimSeobang {
    public String solution(String[] seoul) {
        final int LENGTH = seoul.length;
        
        String result = "";
        for(int i = 0; i < LENGTH; i++) {
            if(seoul[i].equals("Kim")) {
                result = "김서방은 " + i + "에 있다";
                break;
            }
        }
        
        return result;
    }
}
