package level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArraysRotateTest {
    
    @Test
    public void solution() {
        ArraysRotate test = new ArraysRotate();
        
        assertArrayEquals(test.solution(new int[]{1, 2, 3}, "right"), new int[]{3, 1, 2});
        assertArrayEquals(test.solution(new int[]{4, 455, 6, 4, -1, 45, 6}, "left"), new int[]{455, 6, 4, -1, 45, 6, 4});
    }
}