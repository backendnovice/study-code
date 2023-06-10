package level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatrixAdditionTest {
    
    @Test
    public void solution() {
        MatrixAddition test = new MatrixAddition();
        
        assertArrayEquals(test.solution(new int[][]{{1, 2}, {2, 3}}, new int[][]{{3, 4}, {5, 6}}), new int[][]{{4, 6}, {7, 9}});
        assertArrayEquals(test.solution(new int[][]{{1}, {2}}, new int[][]{{3}, {4}}), new int[][]{{4}, {6}});
    }
}