package level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntervalNumbersTest {
    
    @Test
    public void solution() {
        IntervalNumbers test = new IntervalNumbers();
        
        assertArrayEquals(test.solution(2, 5), new long[]{2, 4, 6, 8, 10});
        assertArrayEquals(test.solution(4, 3), new long[]{4, 8, 12});
        assertArrayEquals(test.solution(-4, 2), new long[]{-4, -8});
    }
}