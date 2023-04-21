package level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberToStringTest {
    
    @Test
    public void solution() {
        NumberToString test = new NumberToString();
        
        assertEquals(test.solution(123), "123");
        assertEquals(test.solution(2573), "2573");
    }
}