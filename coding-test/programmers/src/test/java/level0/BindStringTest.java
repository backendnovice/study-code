package level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BindStringTest {
    
    @Test
    public void solution() {
        BindString test = new BindString();
        
        assertEquals(test.solution(new String[]{"a", "bc", "d", "efg", "hi"}), 2);
    }
}