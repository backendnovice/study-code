package level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindNumberTest {
    
    @Test
    public void solution() {
        FindNumber test = new FindNumber();
        
        assertEquals(test.solution(29183, 1), 3);
        assertEquals(test.solution(232443, 4), 4);
        assertEquals(test.solution(123456, 7), -1);
    }
}