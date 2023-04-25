package level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WaterMellonTest {
    
    @Test
    public void solution() {
        WaterMellon test = new WaterMellon();
        
        assertEquals(test.solution(3), "수박수");
        assertEquals(test.solution(4), "수박수박");
    }
}