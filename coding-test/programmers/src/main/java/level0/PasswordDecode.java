package level0;

public class PasswordDecode {
    public String solution(String cipher, int code) {
        final int LENGTH = cipher.length();
        
        StringBuilder result = new StringBuilder();
        
        for(int i = code; i <= LENGTH; i += code) {
            result.append(cipher.charAt(i - 1));
        }
        
        return result.toString();
    }
}
