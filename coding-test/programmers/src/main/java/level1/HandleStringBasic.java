package level1;

public class HandleStringBasic {
    public boolean solution(String s) {
        final int LENGTH = s.length();
        char[] characters = s.toCharArray();
        
        if(LENGTH == 4 || LENGTH == 6) {
            for(char character : characters) {
                if(Character.isAlphabetic(character))
                    return false;
            }
            return true;
        }
        
        return false;
    }
}
