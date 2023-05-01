package level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddElementsAsElementsTest {
    
    @Test
    public void solution() {
        AddElementsAsElements test = new AddElementsAsElements();
        
        assertArrayEquals(test.solution(new int[]{5, 1, 4}), new int[]{5, 5, 5, 5, 5, 1, 4, 4, 4, 4});
        assertArrayEquals(test.solution(new int[]{6, 6}), new int[]{6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6});
        assertArrayEquals(test.solution(new int[]{1}), new int[]{1});
    }
}