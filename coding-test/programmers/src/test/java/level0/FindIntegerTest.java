package level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindIntegerTest {
    
    @Test
    public void solution() {
        FindInteger test = new FindInteger();
        
        assertEquals(test.solution(new int[]{1, 2, 3, 4, 5}, 3), 1);
        assertEquals(test.solution(new int[]{15, 98, 23, 2, 15}, 20), 0);
    }
}