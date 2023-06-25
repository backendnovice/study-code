package level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OverwriteStringTest {
    
    @Test
    public void solution() {
        OverwriteString test = new OverwriteString();
        
        assertEquals(test.solution("He11oWor1d", "lloWorl", 2), "HelloWorld");
        assertEquals(test.solution("Program29b8UYP", "merS123", 7), "ProgrammerS123");
    }
}