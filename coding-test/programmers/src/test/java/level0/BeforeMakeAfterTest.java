package level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BeforeMakeAfterTest {
    
    @Test
    public void solution() {
        BeforeMakeAfter test = new BeforeMakeAfter();
        
        assertEquals(test.solution("olleh", "hello"), 1);
        assertEquals(test.solution("allpe", "apple"), 0);
    }
}