package level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultipleOfNTest {
    
    @Test
    public void solution() {
        MultipleOfN test = new MultipleOfN();
        
        assertArrayEquals(test.solution(3, new int[]{4, 5, 6, 7, 8, 9, 10, 11, 12}), new int[]{6, 9, 12});
        assertArrayEquals(test.solution(5, new int[]{1, 9, 3, 10, 13, 5}), new int[]{10, 5});
        assertArrayEquals(test.solution(12, new int[]{2, 100, 120, 600, 12, 12}), new int[]{120, 600, 12, 12});
    }
}