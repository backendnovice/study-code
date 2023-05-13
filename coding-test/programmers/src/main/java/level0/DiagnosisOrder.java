package level0;

import java.util.ArrayList;
import java.util.List;

public class DiagnosisOrder {
    public int[] solution(int[] emergency) {
        List<Integer> result = new ArrayList<>();
        
        for(int i = 0; i < emergency.length; i++) {
            int order = emergency.length;
            for(int j = 0; j < emergency.length; j++) {
                if(emergency[i] > emergency[j]) {
                    order--;
                }
            }
            result.add(order);
        }
        
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
