package level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HorJjagGameTest {
    
    @Test
    public void solution() {
        HorJjagGame test = new HorJjagGame();
        
        assertEquals(test.solution(7), 16);
        assertEquals(test.solution(10), 220);
    }
}