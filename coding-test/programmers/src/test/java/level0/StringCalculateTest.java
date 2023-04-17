package level0;

import org.junit.jupiter.api.Test;

import javax.script.ScriptException;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculateTest {
    
    @Test
    public void solution() throws ScriptException {
        StringCalculate test = new StringCalculate();
        
        assertEquals(test.solution("3 + 4"), 7);
    }
}