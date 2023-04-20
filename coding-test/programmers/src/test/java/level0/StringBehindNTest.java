package level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringBehindNTest {
    
    @Test
    public void solution() {
        StringBehindN test = new StringBehindN();
        
        assertEquals(test.solution("ProgrammerS123", 11), "grammerS123");
        assertEquals(test.solution("He110W0r1d", 5), "W0r1d");
    }
}