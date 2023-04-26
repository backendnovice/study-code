package level0;

public class FindString {
    public int solution(String myString, String pat) {
        return (myString.toLowerCase().contains(pat.toLowerCase())) ? 1 : 0;
    }
}
