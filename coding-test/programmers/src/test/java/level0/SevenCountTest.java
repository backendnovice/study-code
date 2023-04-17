package level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SevenCountTest {
    
    @Test
    public void solution() {
        SevenCount test = new SevenCount();
        
        assertEquals(test.solution(new int[]{7, 77, 17}), 4);
        assertEquals(test.solution(new int[]{10, 29}), 0);
    }
}