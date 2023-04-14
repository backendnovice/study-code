package level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArraysDuplicateTest {
    
    @Test
    public void solution() {
        ArraysDuplicate test = new ArraysDuplicate();
        
        assertEquals(test.solution(new int[]{1, 1, 2, 3, 4, 5}, 1), 2);
        assertEquals(test.solution(new int[]{0, 2, 3, 4}, 1), 0);
    }
}