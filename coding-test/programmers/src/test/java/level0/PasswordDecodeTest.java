package level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordDecodeTest {
    
    @Test
    public void solution() {
        PasswordDecode test = new PasswordDecode();
        
        assertEquals(test.solution("dfjardstddetckdaccccdegk", 4), "attack");
        assertEquals(test.solution("pfqallllabwaoclk", 2), "fallback");
    }
}