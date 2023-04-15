package level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumHiddenNumberTest {
    
    @Test
    public void solution() {
        SumHiddenNumber test = new SumHiddenNumber();
        
        assertEquals(test.solution("aAb1B2cC34oOp"), 10);
        assertEquals(test.solution("1a2b3c4d123"), 16);
    }
}