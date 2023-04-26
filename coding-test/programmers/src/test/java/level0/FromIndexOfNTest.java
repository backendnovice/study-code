package level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FromIndexOfNTest {
    
    @Test
    public void solution() {
        FromIndexOfN test = new FromIndexOfN();
        
        assertArrayEquals(test.solution(new int[]{2, 1, 6}, 3), new int[]{6});
        assertArrayEquals(test.solution(new int[]{5, 2, 1, 7, 5}, 2), new int[]{2, 1, 7, 5});
    }
}