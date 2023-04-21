package level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReturnAverageTest {
    
    @Test
    public void solution() {
        ReturnAverage test = new ReturnAverage();
        
        assertEquals(test.solution(new int[]{1, 2, 3, 4}), 2.5);
        assertEquals(test.solution(new int[]{5, 5}), 5);
    }
}