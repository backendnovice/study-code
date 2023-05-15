package level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConvertArrayByCondition3Test {
    
    @Test
    public void solution() {
        ConvertArrayByCondition3 test = new ConvertArrayByCondition3();
        
        assertArrayEquals(test.solution(new int[]{1, 2, 3, 100, 99, 98}, 3), new int[]{3, 6, 9, 300, 297, 294});
        assertArrayEquals(test.solution(new int[]{1, 2, 3, 100, 99, 98}, 2), new int[]{3, 4, 5, 102, 101, 100});
    }
}