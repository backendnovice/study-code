package level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OutputCharacterRepeatTest {
    
    @Test
    public void solution() {
        OutputCharacterRepeat test = new OutputCharacterRepeat();
        
        assertEquals(test.solution("hello", 3), "hhheeellllllooo");
    }
}