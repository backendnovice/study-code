package level0;

public class MakeToL {
    public String solution(String myString) {
        char[] myChars = myString.toCharArray();
        
        for(int i = 0; i < myString.length(); i++) {
            if(myChars[i] < 'l') myChars[i] = 'l';
        }
        
        return String.valueOf(myChars);
    }
}
