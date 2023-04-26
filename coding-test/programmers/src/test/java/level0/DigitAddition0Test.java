package level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DigitAddition0Test {
    
    @Test
    public void solution() {
        DigitAddition0 test = new DigitAddition0();
        
        assertEquals(test.solution(1234), 10);
        assertEquals(test.solution(930211), 16);
    }
}