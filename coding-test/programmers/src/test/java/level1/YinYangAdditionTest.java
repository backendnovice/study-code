package level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class YinYangAdditionTest {
    
    @Test
    public void solution() {
        YinYangAddition test = new YinYangAddition();
        
        assertEquals(test.solution(new int[]{4, 7, 12}, new boolean[]{true, false, true}), 9);
        assertEquals(test.solution(new int[]{1, 2, 3}, new boolean[]{false, false, true}), 0);
    }
}