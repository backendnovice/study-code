package level0;

public class CountPatString {
    public int solution(String my_string, String pat) {
        final int LENGTH = my_string.length();
        final int LENGTH_PAT = pat.length();
        int count = 0;
        
        for(int i = 0; i < LENGTH; i++) {
            if(i + LENGTH_PAT <= LENGTH) {
                if(my_string.substring(i, i + LENGTH_PAT).equals(pat))
                    count++;
            }else {
                break;
            }
        }
        
        return count;
    }
}
