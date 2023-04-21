package level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountPYTest {
    
    @Test
    public void solution() {
        CountPY test = new CountPY();
        
        assertEquals(test.solution("pPoooyY"), true);
        assertEquals(test.solution("Pyy"), false);
    }
}