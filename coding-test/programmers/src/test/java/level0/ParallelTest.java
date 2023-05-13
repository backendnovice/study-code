package level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParallelTest {
    
    @Test
    public void solution() {
        Parallel test = new Parallel();
        
        assertEquals(test.solution(new int[][]{{1, 4}, {9, 2}, {3, 8}, {11, 6}}), 1);
        assertEquals(test.solution(new int[][]{{3, 5}, {4, 1}, {2, 4}, {5, 10}}), 0);
        
    }
}