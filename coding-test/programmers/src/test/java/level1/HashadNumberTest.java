package level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HashadNumberTest {
    
    @Test
    public void solution() {
        HashadNumber test = new HashadNumber();
        
        assertTrue(test.solution(10));
        assertTrue(test.solution(12));
        assertFalse(test.solution(11));
        assertFalse(test.solution(13));
    }
}