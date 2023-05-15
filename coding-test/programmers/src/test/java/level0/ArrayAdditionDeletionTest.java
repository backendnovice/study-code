package level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayAdditionDeletionTest {
    
    @Test
    public void solution() {
        ArrayAdditionDeletion test = new ArrayAdditionDeletion();
        
        assertArrayEquals(test.solution(new int[]{3, 2, 4, 1, 3}, new boolean[]{true, false, true, false, false}), new int[]{3, 3, 3, 3, 4, 4, 4, 4});
    }
}