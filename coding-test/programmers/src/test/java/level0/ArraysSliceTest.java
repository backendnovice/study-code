package level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArraysSliceTest {
    
    @Test
    public void solution() {
        ArraysSlice test = new ArraysSlice();
        
        assertArrayEquals(test.solution(new int[]{1, 2, 3, 4, 5}, 1, 3), new int[]{2, 3, 4});
        assertArrayEquals(test.solution(new int[]{1, 3, 5}, 1, 2), new int[]{3, 5});
    }
}