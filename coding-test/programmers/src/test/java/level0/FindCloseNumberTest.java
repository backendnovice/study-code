package level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindCloseNumberTest {
    
    @Test
    public void solution() {
        FindCloseNumber test = new FindCloseNumber();
        
        assertEquals(test.solution(new int[]{0, 0, 0, 1}, 1), 3);
        assertEquals(test.solution(new int[]{1, 0, 0, 1, 0, 0}, 4), -1);
        assertEquals(test.solution(new int[]{1, 1, 1, 1, 0}, 3), 3);
    }
}