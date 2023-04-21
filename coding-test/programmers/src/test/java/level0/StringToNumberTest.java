package level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringToNumberTest {
    
    @Test
    public void solution() {
        StringToNumber test = new StringToNumber();
        
        assertEquals(test.solution("10"), 10);
        assertEquals(test.solution("8542"), 8542);
    }
}