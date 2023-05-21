package level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MeasureCountSumTest {
    
    @Test
    public void solution() {
        MeasureCountSum test = new MeasureCountSum();
        
        assertEquals(test.solution(13, 17), 43);
        assertEquals(test.solution(24, 27), 52);
    }
}