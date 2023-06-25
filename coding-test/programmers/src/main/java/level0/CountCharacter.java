package level0;

public class CountCharacter {
    public int[] solution(String my_string) {
        final String[] template = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q",
                "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
                "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        final String[] strings = my_string.split("");
        int[] counts = new int[template.length];
        
        for(String string : strings) {
            for(int i = 0; i < template.length; i++) {
                if(template[i].equals(string)) {
                    counts[i]++;
                    break;
                }
            }
        }
        
        return counts;
    }
}
