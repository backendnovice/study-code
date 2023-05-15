package level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringBeforeNTest {
    
    @Test
    public void solution() {
        StringBeforeN test = new StringBeforeN();
        
        assertEquals(test.solution("ProgrammerS123", 11), "ProgrammerS");
        assertEquals(test.solution("He110W0r1d", 5), "He110");
    }
}