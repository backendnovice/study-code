package level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckEndStringTest {
    
    @Test
    public void solution() {
        CheckEndString test = new CheckEndString();
        
        assertEquals(test.solution("banana", "ana"), 1);
        assertEquals(test.solution("banana", "nan"), 0);
        assertEquals(test.solution("banana", "wxyz"), 0);
        assertEquals(test.solution("banana", "abanana"), 0);
    }
}