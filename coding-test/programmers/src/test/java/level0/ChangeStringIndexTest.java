package level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChangeStringIndexTest {
    
    @Test
    public void solution() {
        ChangeStringIndex test = new ChangeStringIndex();
        
        assertEquals(test.solution("hello", 1, 2), "hlelo");
        assertEquals(test.solution("I love you", 3, 6), "I l veoyou");
    }
}