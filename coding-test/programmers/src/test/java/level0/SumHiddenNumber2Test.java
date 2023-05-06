package level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumHiddenNumber2Test {
    
    @Test
    public void solution() {
        SumHiddenNumber2 test = new SumHiddenNumber2();
        
        assertEquals(test.solution("aAb1B2cC34oOp"), 37);
        assertEquals(test.solution("1a2b3c4d123Z"), 133);
    }
}