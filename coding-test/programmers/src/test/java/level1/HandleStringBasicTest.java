package level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HandleStringBasicTest {
    
    @Test
    public void solution() {
        HandleStringBasic test = new HandleStringBasic();
        
        assertFalse(test.solution("a234"));
        assertTrue(test.solution("1234"));
    }
}