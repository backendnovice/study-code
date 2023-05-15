package level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ToNArrayTest {
    
    @Test
    public void solution() {
        ToNArray test = new ToNArray();
        
        assertArrayEquals(test.solution(new int[]{2, 1, 6}, 1), new int[]{2});
        assertArrayEquals(test.solution(new int[]{5, 2, 1, 7, 5}, 3), new int[]{5, 2, 1});
    }
}