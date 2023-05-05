package level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveFrontZeroTest {
    
    @Test
    public void solution() {
        RemoveFrontZero test = new RemoveFrontZero();
        
        assertEquals(test.solution("0010"), "10");
        assertEquals(test.solution("854020"), "854020");
    }
}