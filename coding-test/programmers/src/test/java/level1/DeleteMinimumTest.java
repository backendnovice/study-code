package level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeleteMinimumTest {
    
    @Test
    public void solution() {
        DeleteMinimum test = new DeleteMinimum();
        
        assertArrayEquals(test.solution(new int[]{4, 3, 2, 1}), new int[]{4, 3, 2});
        assertArrayEquals(test.solution(new int[]{10}), new int[]{-1});
    }
}