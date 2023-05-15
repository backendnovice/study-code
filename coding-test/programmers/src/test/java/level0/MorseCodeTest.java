package level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MorseCodeTest {
    
    @Test
    public void solution() {
        MorseCode test = new MorseCode();
        
        assertEquals(test.solution(".... . .-.. .-.. ---"), "hello");
        assertEquals(test.solution(".--. -.-- - .... --- -."), "python");
    }
}