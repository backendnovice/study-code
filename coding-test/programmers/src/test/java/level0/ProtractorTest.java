package level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProtractorTest {
    
    @Test
    public void solution() {
        Protractor test = new Protractor();
        
        assertEquals(test.solution(70), 1);
        assertEquals(test.solution(91), 3);
        assertEquals(test.solution(180), 4);
    }
}