package level0;

import java.util.ArrayList;
import java.util.List;

public class ListSlice {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        List<Integer> list = new ArrayList<>();
        int start = slicer[0], end = slicer[1], interval = slicer[2];
        
        switch (n) {
            case 1:
                for(int i = 0; i <= end; i++)
                    list.add(num_list[i]);
                break;
            case 2:
                end = num_list.length;
                for(int i = start; i < end; i++)
                    list.add(num_list[i]);
                break;
            case 3:
                for(int i = start; i <= end; i++)
                    list.add(num_list[i]);
                break;
            case 4:
                for(int i = start; i <= end; i += interval)
                    list.add(num_list[i]);
                break;
        }
        
        return list.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
