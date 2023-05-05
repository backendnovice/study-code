package level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConvertToMultiArrayTest {
    
    @Test
    public void solution() {
        ConvertToMultiArray test = new ConvertToMultiArray();
        
        assertArrayEquals(test.solution(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, 2), new int[][]{{1, 2}, {3, 4}, {5, 6}, {7, 8}});
        assertArrayEquals(test.solution(new int[]{100, 95, 2, 4, 5, 6, 18, 33, 948}, 3), new int[][]{{100, 95, 2}, {4, 5, 6}, {18, 33, 948}});
    }
}