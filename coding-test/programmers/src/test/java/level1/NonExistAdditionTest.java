package level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NonExistAdditionTest {
    
    @Test
    public void solution() {
        NonExistAddition test = new NonExistAddition();
        
        assertEquals(test.solution(new int[]{1, 2, 3, 4, 6, 7, 8, 0}), 14);
        assertEquals(test.solution(new int[]{5, 8, 4, 0, 6, 7, 9}), 6);
    }
}