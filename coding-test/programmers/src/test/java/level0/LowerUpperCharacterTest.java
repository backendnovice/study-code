package level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LowerUpperCharacterTest {
    
    @Test
    public void solution() {
        LowerUpperCharacter test = new LowerUpperCharacter();
        
        assertEquals(test.solution("cccCCC"), "CCCccc");
        assertEquals(test.solution("abCdEfghIJ"), "ABcDeFGHij");
    }
}