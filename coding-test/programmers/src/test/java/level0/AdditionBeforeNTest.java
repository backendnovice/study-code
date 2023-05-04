package level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdditionBeforeNTest {
    
    @Test
    public void solution() {
        AdditionBeforeN test = new AdditionBeforeN();
        
        assertEquals(test.solution(new int[]{34, 5, 71, 29, 100, 34}, 123), 139);
        assertEquals(test.solution(new int[]{58, 44, 27, 10, 100}, 139), 239);
    }
}