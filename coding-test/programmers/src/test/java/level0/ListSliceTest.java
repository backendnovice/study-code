package level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListSliceTest {
    
    @Test
    public void solution() {
        ListSlice test = new ListSlice();
        
        assertArrayEquals(test.solution(3, new int[]{1, 5, 2}, new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}), new int[]{2, 3, 4, 5, 6});
        assertArrayEquals(test.solution(4, new int[]{1, 5, 2}, new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}), new int[]{2, 4, 6});
    }
}