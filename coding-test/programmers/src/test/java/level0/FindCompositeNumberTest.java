package level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindCompositeNumberTest {
    
    @Test
    public void solution() {
        FindCompositeNumber test = new FindCompositeNumber();
        
        assertEquals(test.solution(10), 5);
        assertEquals(test.solution(15), 8);
    }
}