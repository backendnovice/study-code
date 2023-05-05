package level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ControlZTest {
    
    @Test
    public void solution() {
        ControlZ test = new ControlZ();
        
        assertEquals(test.solution("1 2 Z 3"), 4);
        assertEquals(test.solution("10 20 30 40"), 100);
        assertEquals(test.solution("10 Z 20 Z 1"), 1);
        assertEquals(test.solution("0 Z 20 Z"), 0);
        assertEquals(test.solution("-1 -2 -3 Z"), -3);
    }
}