package level0;

public class LowerUpperCharacter {
    public String solution(String my_string) {
        char[] chars = my_string.toCharArray();
        
        StringBuilder result = new StringBuilder();
        for(Character character : chars) {
            result.append(
                    (Character.isUpperCase(character))
                            ? (character + "").toLowerCase() : (character + "").toUpperCase()
            );
        }
        
        return result.toString();
    }
}
