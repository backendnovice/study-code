package level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindStringTest {
    
    @Test
    public void solution() {
        FindString test = new FindString();
        
        assertEquals(test.solution("AbCdEfG", "aBc"), 1);
        assertEquals(test.solution("aaAA", "aaaaa"), 0);
    }
}