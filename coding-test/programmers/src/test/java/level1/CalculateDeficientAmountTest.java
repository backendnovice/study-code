package level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculateDeficientAmountTest {
    
    @Test
    public void solution() {
        CalculateDeficientAmount test = new CalculateDeficientAmount();
        
        assertEquals(test.solution(3, 20, 4), 10);
    }
}