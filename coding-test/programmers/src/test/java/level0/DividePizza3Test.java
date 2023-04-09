package level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DividePizza3Test {
    
    @Test
    public void solution() {
        DividePizza3 test = new DividePizza3();
        
        assertEquals(test.solution(7, 10), 2);
        assertEquals(test.solution(4, 12), 3);
    }
}