package level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AntRegionTest {
    
    @Test
    public void solution() {
        AntRegion test = new AntRegion();
        
        assertEquals(test.solution(23), 5);
        assertEquals(test.solution(24), 6);
        assertEquals(test.solution(999), 201);
    }
}