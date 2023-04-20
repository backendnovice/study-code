package level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringContainsTest {
    
    @Test
    public void solution() {
        StringContains test = new StringContains();
        
        assertEquals(test.solution("abc", "aabcc"), 1);
        assertEquals(test.solution("tbt", "tbbttb"), 0);
    }
}