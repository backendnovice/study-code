package level0;

public class RemoveVowels {
    public String solution(String my_string) {
        final String[] vowels = {"a", "e", "i", "o", "u"};
        
        return my_string.replaceAll("a|e|i|o|u", "");
    }
}
