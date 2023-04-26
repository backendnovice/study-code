package level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompareConcatenatedNumberTest {
    
    @Test
    public void solution() {
        CompareConcatenatedNumber test = new CompareConcatenatedNumber();
        
        assertEquals(test.solution(9,91), 991);
        assertEquals(test.solution(89,8), 898);
    }
}