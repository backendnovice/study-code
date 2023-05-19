package level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AreaOfTwoTest {
    
    @Test
    public void solution() {
        AreaOfTwo test = new AreaOfTwo();
        
        assertArrayEquals(test.solution(new int[]{1, 2, 1, 4, 5, 2, 9}), new int[]{2, 1, 4, 5, 2});
        assertArrayEquals(test.solution(new int[]{1, 2, 1}), new int[]{2});
        assertArrayEquals(test.solution(new int[]{1, 1, 1}), new int[]{-1});
        assertArrayEquals(test.solution(new int[]{1, 2, 1, 2, 1, 10, 2, 1}), new int[]{2, 1, 2, 1, 10, 2});
    }
}