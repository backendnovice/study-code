package level0;

public class StringBehindN {
    public String solution(String my_string, int n) {
        return my_string.substring(my_string.length() - n);
    }
}
