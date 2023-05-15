package level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CollatzSequenceTest {
    
    @Test
    public void solution() {
        CollatzSequence test = new CollatzSequence();
        
        assertArrayEquals(test.solution(10), new int[]{10, 5, 16, 8, 4, 2, 1});
    }
}