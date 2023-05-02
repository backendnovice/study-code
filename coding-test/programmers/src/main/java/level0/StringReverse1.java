package level0;

public class StringReverse1 {
    public String solution(String my_string, int s, int e) {
        StringBuilder string_original = new StringBuilder(my_string);
        String string_reversed = new StringBuilder(my_string.substring(s, e + 1)).reverse().toString();
        
        return string_original.replace(s, e + 1, string_reversed).toString();
    }
}
