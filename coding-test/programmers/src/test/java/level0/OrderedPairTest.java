package level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderedPairTest {
    
    @Test
    public void solution() {
        OrderedPair test = new OrderedPair();
        
        assertEquals(test.solution(20), 6);
        assertEquals(test.solution(100), 9);
    }
}