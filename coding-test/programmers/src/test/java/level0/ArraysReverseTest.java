package level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArraysReverseTest {
    
    @Test
    void solution() {
        ArraysReverse test = new ArraysReverse();
        
        assertArrayEquals(test.solution(new int[]{1, 2, 3, 4, 5}), new int[]{5, 4, 3, 2, 1});
        assertArrayEquals(test.solution(new int[]{1, 1, 1, 1, 1, 2}), new int[]{2, 1, 1, 1, 1, 1});
        assertArrayEquals(test.solution(new int[]{1, 0, 1, 1, 1, 3, 5}), new int[]{5, 3, 1, 1, 1, 0, 1});
    }
}