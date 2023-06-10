package level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleFormulaTest {
    
    @Test
    public void solution() {
        SimpleFormula test = new SimpleFormula();
        
        assertEquals(test.solution("43 + 12"), 55);
        assertEquals(test.solution("0 - 7777"), -7777);
        assertEquals(test.solution("40000 * 40000"), 1600000000);
    }
}