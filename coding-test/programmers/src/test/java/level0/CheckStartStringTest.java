package level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckStartStringTest {
    
    @Test
    public void solution() {
        CheckStartString test = new CheckStartString();
        
        assertEquals(test.solution("banana", "ban"), 1);
        assertEquals(test.solution("banana", "nan"), 0);
        assertEquals(test.solution("banana", "abcd"), 0);
        assertEquals(test.solution("banana", "bananan"), 0);
    }
}