package level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringReplaceTest {
    
    @Test
    public void solution() {
        StringReplace test = new StringReplace();
        
        assertEquals(test.solution("abcdef", "f"), "abcde");
        assertEquals(test.solution("BCBdbe", "B"), "Cdbe");
    }
}