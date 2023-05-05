package level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountKTest {
    
    @Test
    public void solution() {
        CountK test = new CountK();
        
        assertEquals(test.solution(1, 13, 1), 6);
        assertEquals(test.solution(10, 50, 5), 5);
        assertEquals(test.solution(3, 10, 2), 0);
    }
}