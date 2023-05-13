package level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextNumberTest {
    
    @Test
    public void solution() {
        NextNumber test = new NextNumber();
        
        assertEquals(test.solution(new int[]{1, 2, 3, 4}), 5);
        assertEquals(test.solution(new int[]{2, 4, 8}), 16);
    }
}