package level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MakeDivisibleArrayTest {
    
    @Test
    public void solution() {
        MakeDivisibleArray test = new MakeDivisibleArray();
        
        assertArrayEquals(test.solution(new int[]{5, 9, 7, 10}, 5), new int[]{5, 10});
        assertArrayEquals(test.solution(new int[]{2, 36, 1, 3}, 1), new int[]{1, 2, 3, 36});
        assertArrayEquals(test.solution(new int[]{3, 2, 6}, 10), new int[]{-1});
    }
}