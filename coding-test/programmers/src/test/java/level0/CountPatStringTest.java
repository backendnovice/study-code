package level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountPatStringTest {
    
    @Test
    public void solution() {
        CountPatString test = new CountPatString();
        
        assertEquals(test.solution("banana", "ana"), 2);
        assertEquals(test.solution("aaaa", "aa"), 3);
    }
}