package level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PositionPointTest {
    
    @Test
    public void solution() {
        PositionPoint test = new PositionPoint();
        
        assertEquals(test.solution(new int[]{2, 4}), 1);
        assertEquals(test.solution(new int[]{-7, 9}), 2);
    }
}