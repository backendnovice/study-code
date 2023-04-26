package level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReplaceToUpperCaseTest {
    
    @Test
    public void solution() {
        ReplaceToUpperCase test = new ReplaceToUpperCase();
        
        assertEquals(test.solution("programmers", "p"), "Programmers");
        assertEquals(test.solution("lowercase", "x"), "lowercase");
    }
}