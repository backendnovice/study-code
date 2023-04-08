package level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumEvenNumbersTest {
    
    @Test
    void solution() {
        SumEvenNumbers test = new SumEvenNumbers();
        
        assertEquals(test.solution(10), 30);
        assertEquals(test.solution(4), 6);
    }
}