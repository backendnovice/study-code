package level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntegerPartTest {
    
    @Test
    public void solution() {
        IntegerPart test = new IntegerPart();
        
        assertEquals(test.solution(1.42), 1);
        assertEquals(test.solution(69.32), 69);
    }
}