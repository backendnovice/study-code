package level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IHateEqualsTest {
    
    @Test
    public void solution() {
        IHateEquals test = new IHateEquals();
        
        assertArrayEquals(test.solution(new int[]{1, 1, 3, 3, 0, 1, 1}), new int[]{1, 3, 0, 1});
        assertArrayEquals(test.solution(new int[]{4, 4, 4, 3, 3}), new int[]{4, 3});
    }
}