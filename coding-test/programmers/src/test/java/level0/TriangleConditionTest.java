package level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleConditionTest {
    
    @Test
    public void solution() {
        TriangleCondition test = new TriangleCondition();
        
        assertEquals(test.solution(new int[]{1, 2, 3}), 2);
        assertEquals(test.solution(new int[]{3, 6, 2}), 2);
        assertEquals(test.solution(new int[]{199, 72, 222}), 1);
    }
}