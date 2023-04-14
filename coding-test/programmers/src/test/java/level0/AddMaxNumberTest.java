package level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddMaxNumberTest {
    
    @Test
    public void solution() {
        AddMaxNumber test = new AddMaxNumber();
        
        assertEquals(test.solution(new int[]{1, 2, 3, 4, 5}), 20);
        assertEquals(test.solution(new int[]{0, 31, 24, 10, 1, 9}), 744);
    }
}