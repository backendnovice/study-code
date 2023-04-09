package level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindModeNumberTest {
    
    @Test
    public void solution() {
        FindModeNumber test = new FindModeNumber();
        
        assertEquals(test.solution(new int[]{1, 2, 3, 3, 3, 4}), 3);
        assertEquals(test.solution(new int[]{1, 1, 2, 2}), -1);
        assertEquals(test.solution(new int[]{1}), 1);
    }
}