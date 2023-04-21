package level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemainderIsOneTest {
    
    @Test
    public void solution() {
        RemainderIsOne test = new RemainderIsOne();
        
        assertEquals(test.solution(10), 3);
        assertEquals(test.solution(12), 11);
    }
}