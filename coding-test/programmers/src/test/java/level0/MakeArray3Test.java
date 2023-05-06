package level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MakeArray3Test {
    
    @Test
    public void solution() {
        MakeArray3 test = new MakeArray3();
        
        assertArrayEquals(test.solution(new int[]{1, 2, 3, 4, 5}, new int[][]{{1, 3}, {0, 4}}), new int[]{2, 3, 4, 1, 2, 3, 4, 5});
    }
}