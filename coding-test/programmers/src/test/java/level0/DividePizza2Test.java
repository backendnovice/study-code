package level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DividePizza2Test {
    
    @Test
    public void solution() {
        DividePizza2 test = new DividePizza2();
        
        assertEquals(test.solution(6), 1);
        assertEquals(test.solution(10), 5);
        assertEquals(test.solution(4), 2);
    }
}