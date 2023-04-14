package level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LetterTest {
    
    @Test
    public void solution() {
        Letter test = new Letter();
        
        assertEquals(test.solution("happy birthday!"), 30);
        assertEquals(test.solution("I Love you~"), 22);
    }
}