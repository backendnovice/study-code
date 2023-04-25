package level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InnerProductTest {
    
    @Test
    public void solution() {
        InnerProduct test = new InnerProduct();
        
        assertEquals(test.solution(new int[]{1, 2, 3, 4}, new int[]{-3, -1, 0, 2}), 3);
        assertEquals(test.solution(new int[]{-1, 0, 1}, new int[]{1, 0, -1}), -2);
    }
}