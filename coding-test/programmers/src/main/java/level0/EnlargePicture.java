package level0;

import java.util.ArrayList;
import java.util.List;

public class EnlargePicture {
    public String[] solution(String[] picture, int k) {
        List<String> result = new ArrayList<>();
        
        for(int i = 0; i < picture.length; i++) {
            StringBuilder sb = new StringBuilder();
            String[] line = picture[i].split("");
            for(int j = 0; j < line.length; j++) {
                for(int h = 0; h < k; h++) {
                    sb.append(line[j]);
                }
            }
            for(int h = 0; h < k; h++) {
                result.add(sb.toString());
            }
        }
        
        return result.toArray(new String[0]);
    }
}
