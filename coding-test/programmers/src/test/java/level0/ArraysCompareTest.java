package level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArraysCompareTest {
    
    @Test
    public void solution() {
        ArraysCompare test = new ArraysCompare();
        
        assertEquals(test.solution(new int[]{49, 13}, new int[]{70, 11, 2}), -1);
        assertEquals(test.solution(new int[]{100, 17, 84, 1}, new int[]{55, 12, 65, 36}), 1);
        assertEquals(test.solution(new int[]{1, 2, 3, 4, 5}, new int[]{3, 3, 3, 3, 3}), 0);
    }
}