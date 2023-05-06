package level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionStringTest {
    
    @Test
    public void solution() {
        ConditionString test = new ConditionString();
        
        assertEquals(test.solution("<", "=", 20, 50), 1);
        assertEquals(test.solution(">", "!", 41, 78), 0);
    }
}