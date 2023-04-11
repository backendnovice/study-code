package level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LambSkewersTest {
    
    @Test
    public void solution() {
        LambSkewers test = new LambSkewers();
        
        assertEquals(test.solution(10, 3), 124000);
        assertEquals(test.solution(64, 6), 768000);
    }
}