package level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberReverseOrderTest {
    
    @Test
    public void solution() {
        NumberReverseOrder test = new NumberReverseOrder();
        
        assertEquals(test.solution(118372), 873211);
    }
}