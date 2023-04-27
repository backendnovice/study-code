package level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TailStringTest {
    
    @Test
    public void solution() {
        TailString test = new TailString();
        
        assertEquals(test.solution(new String[]{"abc", "def", "ghi"}, "ef"), "abcghi");
        assertEquals(test.solution(new String[]{"abc", "bbc", "cbc"}, "c"), "");
    }
}