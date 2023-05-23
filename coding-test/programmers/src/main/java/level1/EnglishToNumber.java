package level1;

import java.util.HashMap;
import java.util.Map;

public class EnglishToNumber {
    public int solution(String s) {
        Map<String, Integer> dictionary = new HashMap<>(){{
            put("zero", 0);
            put("one", 1);
            put("two", 2);
            put("three", 3);
            put("four", 4);
            put("five", 5);
            put("six", 6);
            put("seven", 7);
            put("eight", 8);
            put("nine", 9);
        }};
        
        for(Map.Entry<String, Integer> entry : dictionary.entrySet()) {
            s = s.replaceAll(entry.getKey(), String.valueOf(entry.getValue()));
        }
        
        return Integer.parseInt(s);
    }
}
