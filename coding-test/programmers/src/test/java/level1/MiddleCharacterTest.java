package level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MiddleCharacterTest {
    
    @Test
    public void solution() {
        MiddleCharacter test = new MiddleCharacter();
        
        assertEquals(test.solution("abcde"), "c");
        assertEquals(test.solution("qwer"), "we");
    }
}