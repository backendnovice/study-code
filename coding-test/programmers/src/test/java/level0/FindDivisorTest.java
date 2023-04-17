package level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindDivisorTest {
    
    @Test
    public void solution() {
        FindDivisor test = new FindDivisor();
        
        assertArrayEquals(test.solution(24), new int[]{1, 2, 3, 4, 6, 8, 12, 24});
        assertArrayEquals(test.solution(29), new int[]{1, 29});
    }
}