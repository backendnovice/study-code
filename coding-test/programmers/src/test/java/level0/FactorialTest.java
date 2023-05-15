package level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {
    
    @Test
    public void solution() {
        Factorial test = new Factorial();
        
        assertEquals(test.solution(3628800), 10);
        assertEquals(test.solution(7), 3);
    }
}