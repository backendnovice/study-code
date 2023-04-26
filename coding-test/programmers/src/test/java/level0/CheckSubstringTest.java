package level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckSubstringTest {
    
    @Test
    public void solution() {
        CheckSubstring test = new CheckSubstring();
        
        assertEquals(test.solution("banana", "ana"), 1);
        assertEquals(test.solution("banana", "wxyz"), 0);
    }
}