package level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculateByLengthTest {
    
    @Test
    public void solution() {
        CalculateByLength test = new CalculateByLength();
        
        assertEquals(test.solution(new int[]{3, 4, 5, 2, 5, 4, 6, 7, 3, 7, 2, 2, 1}), 51);
        assertEquals(test.solution(new int[]{2, 3, 4, 5}), 120);
    }
}