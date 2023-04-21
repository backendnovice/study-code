package level1;

import java.util.Arrays;

public class CountPY {
    boolean solution(String s) {
        String string = s.toUpperCase();
        
        int pCount = countCharacter(string, "P");
        int yCount = countCharacter(string, "Y");
        
        return pCount == yCount;
    }
    
    private int countCharacter(String string, String chars) {
        return (int) Arrays
                .stream(string.split(""))
                .filter(str -> str.equals(chars))
                .count();
    }
}
