package level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringReverse1Test {
    
    @Test
    public void solution() {
        StringReverse1 test = new StringReverse1();
        
        assertEquals(test.solution("Progra21Sremm3", 6, 12), "ProgrammerS123");
        assertEquals(test.solution("Stanley1yelnatS", 4, 10), "Stanley1yelnatS");
    }
}