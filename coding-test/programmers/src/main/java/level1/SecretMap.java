package level1;

import java.util.ArrayList;
import java.util.List;

public class SecretMap {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        List<String> result = new ArrayList<>();
    
        String format = "%0" + n + "d";
        
        for(int i = 0; i < n; i++) {
            String _binary = String.format(format, Long.parseLong(Long.toBinaryString(arr1[i] | arr2[i])));
            
            result.add(_binary.replaceAll("0", " ").replaceAll("1", "#"));
        }
        
        return result.toArray(new String[0]);
    }
}
