package level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NearNumberTest {
    
    @Test
    public void solution() {
        NearNumber test = new NearNumber();
        
        assertEquals(test.solution(new int[]{3, 10, 28}, 20), 28);
        assertEquals(test.solution(new int[]{10, 11, 12}, 13), 12);
    }
}