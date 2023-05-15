package level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConvertArrayByCondition1Test {
    
    @Test
    public void solution() {
        ConvertArrayByCondition1 test = new ConvertArrayByCondition1();
        
        assertArrayEquals(test.solution(new int[]{1, 2, 3, 100, 99, 98}), new int[]{2, 2, 6, 50, 99, 49});
    }
}