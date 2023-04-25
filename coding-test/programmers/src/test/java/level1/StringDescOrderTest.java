package level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringDescOrderTest {
    
    @Test
    public void solution() {
        StringDescOrder test = new StringDescOrder();
        
        assertEquals(test.solution("Zbcdefg"), "gfedcbZ");
    }
}