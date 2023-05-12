package level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MakeNumberOneTest {
    
    @Test
    public void solution() {
        MakeNumberOne test = new MakeNumberOne();
        
        assertEquals(test.solution(new int[]{12, 4, 15, 1, 14}), 11);
    }
}