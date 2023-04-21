package level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayToStringTest {
    
    @Test
    public void solution() {
        ArrayToString test = new ArrayToString();
        
        assertEquals(test.solution(new String[]{"a", "b", "c"}), "abc");
    }
}