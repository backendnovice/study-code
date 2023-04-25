package level1;

public class MiddleCharacter {
    public String solution(String s) {
        final int LENGTH = s.length();
        
        return (LENGTH % 2 == 0) ? s.substring(LENGTH / 2 - 1, LENGTH / 2 + 1) : s.charAt(LENGTH / 2) + "";
    }
}
