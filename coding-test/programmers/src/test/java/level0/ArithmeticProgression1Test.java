package level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArithmeticProgression1Test {
    
    @Test
    public void solution() {
        ArithmeticProgression1 test = new ArithmeticProgression1();
        
        assertEquals(test.solution(3, 4, new boolean[]{true, false, false, true, true}), 37);
        assertEquals(test.solution(7, 1, new boolean[]{false, false, false, true, false, false, false}), 10);
    }
}