package level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiceCountTest {
    
    @Test
    public void solution() {
        DiceCount test = new DiceCount();
        
        assertEquals(test.solution(new int[]{1, 1, 1}, 1), 1);
        assertEquals(test.solution(new int[]{10, 8, 6}, 3), 12);
    }
}