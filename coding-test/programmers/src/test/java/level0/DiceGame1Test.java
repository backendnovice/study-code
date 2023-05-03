package level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiceGame1Test {
    
    @Test
    void solution() {
        DiceGame1 test = new DiceGame1();
        
        assertEquals(test.solution(2, 6, 1), 9);
        assertEquals(test.solution(5, 3, 3), 473);
        assertEquals(test.solution(4, 4, 4), 110592);
    }
}