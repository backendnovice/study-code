package level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompareSumMulTest {
    
    @Test
    public void solution() {
        CompareSumMul test = new CompareSumMul();
        
        assertEquals(test.solution(new int[]{3, 4, 5, 2, 1}), 1);
        assertEquals(test.solution(new int[]{5, 7, 8, 3}), 0);
    }
}