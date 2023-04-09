package level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArraysAverageTest {
    
    @Test
    public void solution() {
        ArraysAverage test = new ArraysAverage();
        
        assertEquals(test.solution(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}), 5.5);
        assertEquals(test.solution(new int[]{89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99}), 94.0);
    }
}