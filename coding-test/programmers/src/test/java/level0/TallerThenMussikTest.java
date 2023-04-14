package level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TallerThenMussikTest {
    
    @Test
    public void solution() {
        TallerThenMussik test = new TallerThenMussik();
        
        assertEquals(test.solution(new int[]{149, 180, 192, 170}, 167), 3);
        assertEquals(test.solution(new int[]{180, 120, 140}, 190), 0);
    }
}