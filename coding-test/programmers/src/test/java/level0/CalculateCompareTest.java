package level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculateCompareTest {
    
    @Test
    public void solution() {
        CalculateCompare test = new CalculateCompare();
        
        assertEquals(test.solution(2, 91), 364);
        assertEquals(test.solution(91, 2), 912);
    }
}