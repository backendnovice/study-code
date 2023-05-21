package level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumMeasureTest {
    
    @Test
    public void solution() {
        SumMeasure test = new SumMeasure();
        
        assertEquals(test.solution(12), 28);
        assertEquals(test.solution(5), 6);
    }
}