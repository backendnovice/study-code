package level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FromFiveBackTest {
    
    @Test
    public void solution() {
        FromFiveBack test = new FromFiveBack();
        
        assertArrayEquals(test.solution(new int[]{12, 4, 15, 46, 38, 1, 14}), new int[]{1, 4, 12, 14, 15});
    }
}