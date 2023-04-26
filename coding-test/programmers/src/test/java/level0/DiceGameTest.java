package level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiceGameTest {
    
    @Test
    public void solution() {
        DiceGame test = new DiceGame();
        
        assertEquals(test.solution(3, 5), 34);
        assertEquals(test.solution(6, 1), 14);
        assertEquals(test.solution(2, 4), 2);
    }
}