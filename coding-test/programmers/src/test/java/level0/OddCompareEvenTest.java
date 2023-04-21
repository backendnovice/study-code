package level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OddCompareEvenTest {
    
    @Test
    public void solution() {
        OddCompareEven test = new OddCompareEven();
        
        assertEquals(test.solution(new int[]{4, 2, 6, 1, 7, 6}), 17);
        assertEquals(test.solution(new int[]{-1, 2, 5, 6, 3}), 8);
    }
}