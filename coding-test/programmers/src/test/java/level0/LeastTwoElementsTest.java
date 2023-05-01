package level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeastTwoElementsTest {
    
    @Test
    public void solution() {
        LeastTwoElements test = new LeastTwoElements();
        
        assertArrayEquals(test.solution(new int[]{2, 1, 6}), new int[]{2, 1, 6, 5});
        assertArrayEquals(test.solution(new int[]{5, 2, 1, 7, 5}), new int[]{5, 2, 1, 7, 5, 10});
    }
}