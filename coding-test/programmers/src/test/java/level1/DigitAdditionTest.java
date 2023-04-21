package level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DigitAdditionTest {
    
    @Test
    public void solution() {
        DigitAddition test = new DigitAddition();
        
        assertEquals(test.solution(123), 6);
        assertEquals(test.solution(987), 24);
    }
}