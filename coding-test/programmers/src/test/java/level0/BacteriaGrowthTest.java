package level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BacteriaGrowthTest {
    
    @Test
    void solution() {
        BacteriaGrowth test = new BacteriaGrowth();
        
        assertEquals(test.solution(2, 10), 2048);
        assertEquals(test.solution(7, 15), 229376);
    }
}