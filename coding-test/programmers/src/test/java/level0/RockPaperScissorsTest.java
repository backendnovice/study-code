package level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RockPaperScissorsTest {
    
    @Test
    public void solution() {
        RockPaperScissors test = new RockPaperScissors();
        
        assertEquals(test.solution("2"), "0");
        assertEquals(test.solution("205"), "052");
    }
}