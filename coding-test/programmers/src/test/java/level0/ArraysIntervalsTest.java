package level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArraysIntervalsTest {
    
    @Test
    public void solution() {
        ArraysIntervals test = new ArraysIntervals();
        
        assertArrayEquals(test.solution(new int[]{4, 2, 6, 1, 7, 6}, 2), new int[]{4, 6, 7});
        assertArrayEquals(test.solution(new int[]{4, 2, 6, 1, 7, 6}, 4), new int[]{4, 7});
    }
}