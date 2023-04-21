package level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MakeArrayTest {
    
    @Test
    public void solution() {
        MakeArray test = new MakeArray();
        
        assertArrayEquals(test.solution(10, 3), new int[]{3, 6, 9});
        assertArrayEquals(test.solution(15, 5), new int[]{5, 10, 15});
    }
}