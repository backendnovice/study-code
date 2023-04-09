package level0;

import java.util.*;

public class FindModeNumber {
    public int solution(int[] array) {
        Map<Integer, Integer> frequencies = new HashMap<>();
        
        // 숫자의 빈도를 frequencies에 저장한다.
        for(int number : array) {
            frequencies.put(number, frequencies.getOrDefault(number, 0) + 1);
        }
        
        // 최빈값을 구한다.
        int maxFrequency = Collections.max(frequencies.values());
    
        // 최빈값과 일치하는 키값을 modes에 저장한다.
        List<Integer> modes = new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry : frequencies.entrySet()) {
            if (entry.getValue() == maxFrequency)
                modes.add(entry.getKey());
        }
        
        // 동일한 최빈값이 존재할 경우 -1을 반환한다.
        return (modes.size() == 1) ? modes.get(0) : -1;
    }
}
