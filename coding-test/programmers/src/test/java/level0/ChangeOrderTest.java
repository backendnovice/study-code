package level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChangeOrderTest {
    
    @Test
    public void solution() {
        ChangeOrder test = new ChangeOrder();
        
        assertArrayEquals(test.solution(new int[]{2, 1, 6}, 1), new int[]{1, 6, 2});
        assertArrayEquals(test.solution(new int[]{5, 2, 1, 7, 5}, 3), new int[]{7, 5, 5, 2, 1});
    }
}