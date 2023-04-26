package level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringDigitsAdditionTest {
    
    @Test
    public void solution() {
        StringDigitsAddition test = new StringDigitsAddition();
        
        assertEquals(test.solution("123456789"), 45);
        assertEquals(test.solution("1000000"), 1);
    }
}