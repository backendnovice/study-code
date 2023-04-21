package level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MakeUpperCaseTest {
    
    @Test
    public void solution() {
        MakeUpperCase test = new MakeUpperCase();
        
        assertEquals(test.solution("aBcDeFg"), "ABCDEFG");
        assertEquals(test.solution("AAA"), "AAA");
    }
}