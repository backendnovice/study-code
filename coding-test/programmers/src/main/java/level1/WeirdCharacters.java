package level1;

public class WeirdCharacters {
    public String solution(String s) {
        StringBuilder result = new StringBuilder();
        
        String[] strings = s.split("");
        int count = 0;
        for(int i = 0; i < strings.length; i++) {
            if(strings[i].equals(" ")) {
                count = 0;
                result.append(" ");
                continue;
            }
            
            if(count % 2 == 0)
                result.append(strings[i].toUpperCase());
            else
                result.append(strings[i].toLowerCase());
            count++;
        }
        
        return result.toString();
    }
}
