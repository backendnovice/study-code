package level1;

public class YinYangAddition {
    public int solution(int[] absolutes, boolean[] signs) {
        final int LENGTH = absolutes.length;
        
        int result = 0;
        for(int i = 0; i < LENGTH; i++) {
            result += (signs[i] == true) ? absolutes[i] : -absolutes[i];
        }
        
        return result;
    }
}
