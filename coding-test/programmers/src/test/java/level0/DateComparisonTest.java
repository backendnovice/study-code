package level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DateComparisonTest {
    
    @Test
    public void solution() {
        DateComparison test = new DateComparison();
        
        assertEquals(test.solution(new int[]{2022, 12, 28}, new int[]{2022, 12, 29}), 1);
        assertEquals(test.solution(new int[]{2021, 10, 24}, new int[]{2021, 10, 24}), 0);
    }
}