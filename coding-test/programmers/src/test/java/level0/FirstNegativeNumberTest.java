package level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstNegativeNumberTest {
    
    @Test
    public void solution() {
        FirstNegativeNumber test = new FirstNegativeNumber();
        
        assertEquals(test.solution(new int[]{12, 4, 15, 46, 38, -2, 15}), 5);
        assertEquals(test.solution(new int[]{13, 22, 53, 24, 15, 6}), -1);
    }
}