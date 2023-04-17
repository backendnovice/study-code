package level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindMaxNumberTest {
    
    @Test
    public void solution() {
        FindMaxNumber test = new FindMaxNumber();
        
        assertArrayEquals(test.solution(new int[]{1, 8, 3}), new int[]{8, 1});
        assertArrayEquals(test.solution(new int[]{9, 10, 11, 8}), new int[]{11, 2});
    }
}