package level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WeirdCharactersTest {
    
    @Test
    public void solution() {
        WeirdCharacters test = new WeirdCharacters();
        
        assertEquals(test.solution("try hello world"), "TrY HeLlO WoRlD");
    }
}