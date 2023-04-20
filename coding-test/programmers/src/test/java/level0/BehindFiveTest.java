package level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BehindFiveTest {
    
    @Test
    public void solution() {
        BehindFive test = new BehindFive();
        
        assertArrayEquals(test.solution(new int[]{12, 4, 15, 46, 38, 1, 14, 56, 32, 10}), new int[]{15, 32, 38, 46, 56});
    }
}