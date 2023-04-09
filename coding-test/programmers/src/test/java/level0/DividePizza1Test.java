package level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DividePizza1Test {
    @Test
    public void solution() {
        DividePizza1 test = new DividePizza1();
        
        assertEquals(test.solution(7), 1);
        assertEquals(test.solution(1), 1);
        assertEquals(test.solution(15), 3);
    }
}