package level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Game369Test {
    
    @Test
    public void solution() {
        Game369 test = new Game369();
        
        assertEquals(test.solution(3), 1);
        assertEquals(test.solution(29423), 2);
    }
}