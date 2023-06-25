package level0;

public class OverwriteString {
    public String solution(String my_string, String overwrite_string, int s) {
        String[] originals = my_string.split(""), overwrites = overwrite_string.split("");
        
        for(int i = 0; i < overwrite_string.length(); i++) {
            originals[i + s] = overwrites[i];
        }
        
        return String.join("", originals);
    }
}
