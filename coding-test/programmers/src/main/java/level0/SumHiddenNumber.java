package level0;

public class SumHiddenNumber {
    public int solution(String my_string) {
        char[] chars = my_string.toCharArray();
        
        int result = 0;
        for(char ch : chars) {
            if((ch - '0') < 10) result += (ch - '0');
        }
        
        return result;
    }
}
