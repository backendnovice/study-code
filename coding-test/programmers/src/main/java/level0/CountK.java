package level0;

import java.util.Arrays;

public class CountK {
    public int solution(int i, int j, int k) {
        StringBuilder sb = new StringBuilder();
        
        for(int it = i; it <= j; it++) {
            sb.append(it);
        }
        
        return (int) Arrays
                .stream(sb.toString().split(""))
                .filter(str -> str.contains(String.valueOf(k)))
                .count();
    }
}
