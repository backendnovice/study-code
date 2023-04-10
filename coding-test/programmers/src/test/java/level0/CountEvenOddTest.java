package level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountEvenOddTest {
    
    @Test
    public void solution() {
        CountEvenOdd test = new CountEvenOdd();
        
        assertArrayEquals(test.solution(new int[]{1, 2, 3, 4, 5}), new int[]{2, 3});
        assertArrayEquals(test.solution(new int[]{1, 3, 5, 7}), new int[]{0, 4});
    }
}