package level0;

public class StringMix {
    public String solution(String str1, String str2) {
        final int LENGTH = str1.length();
        
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < LENGTH; i++) {
            result.append(str1.charAt(i) + "" + str2.charAt(i));
        }
        
        return result.toString();
    }
}
