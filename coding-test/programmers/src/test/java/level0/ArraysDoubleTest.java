package level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArraysDoubleTest {
    
    @Test
    public void solution() {
        ArraysDouble test = new ArraysDouble();
        
        assertArrayEquals(test.solution(new int[]{1, 2, 3, 4, 5}), new int[]{2, 4, 6, 8, 10});
        assertArrayEquals(test.solution(new int[]{1, 2, 100, -99, 1, 2, 3}), new int[]{2, 4, 200, -198, 2, 4, 6});
    }
}