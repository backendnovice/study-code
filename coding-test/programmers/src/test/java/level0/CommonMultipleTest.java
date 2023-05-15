package level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CommonMultipleTest {
    
    @Test
    public void solution() {
        CommonMultiple test = new CommonMultiple();
        
        assertEquals(test.solution(60, 2, 3), 1);
        assertEquals(test.solution(55, 10, 5), 0);
    }
}