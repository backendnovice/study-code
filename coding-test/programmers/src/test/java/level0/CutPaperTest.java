package level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CutPaperTest {
    
    @Test
    public void solution() {
        CutPaper test = new CutPaper();
        
        assertEquals(test.solution(2, 2), 3);
        assertEquals(test.solution(2, 5), 9);
        assertEquals(test.solution(1, 1), 0);
    }
}