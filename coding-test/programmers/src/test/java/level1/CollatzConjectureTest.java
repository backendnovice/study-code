package level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CollatzConjectureTest {
    
    @Test
    void solution() {
        CollatzConjecture test = new CollatzConjecture();
        
        assertEquals(test.solution(6), 8);
        assertEquals(test.solution(16), 4);
        assertEquals(test.solution(626331), -1);
    }
}