package level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountDownTest {
    
    @Test
    public void solution() {
        CountDown test = new CountDown();
        
        assertArrayEquals(test.solution(10, 3), new int[]{10, 9, 8, 7, 6, 5, 4, 3});
    }
}