package level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MarbleCaseNumberTest {
    
    @Test
    public void solution() {
        MarbleCaseNumber test = new MarbleCaseNumber();
        
        assertEquals(test.solution(3, 2), 3);
        assertEquals(test.solution(5, 3), 10);
    }
}