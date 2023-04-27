package level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberAttachTest {
    
    @Test
    public void solution() {
        NumberAttach test = new NumberAttach();
        
        assertEquals(test.solution(new int[]{3, 4, 5, 2, 1}), 393);
        assertEquals(test.solution(new int[]{5, 7, 8, 3}), 581);
        
    }
}