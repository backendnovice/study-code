package level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseNumberTest {
    
    @Test
    public void solution() {
        ReverseNumber test = new ReverseNumber();
        
        assertArrayEquals(test.solution(12345), new int[]{5, 4, 3, 2, 1});
    }
}