package level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpecialArray1Test {
    
    @Test
    public void solution() {
        SpecialArray1 test = new SpecialArray1();
        
        assertArrayEquals(test.solution(3), new int[][]{{1,0,0}, {0,1,0}, {0,0,1}});
        assertArrayEquals(test.solution(6), new int[][]{{1,0,0,0,0,0}, {0,1,0,0,0,0}, {0,0,1,0,0,0}, {0,0,0,1,0,0}, {0,0,0,0,1,0}, {0,0,0,0,0,1}});
        assertArrayEquals(test.solution(1), new int[][]{{1}});
    }
}