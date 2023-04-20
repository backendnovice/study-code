package level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultipleOfN1Test {
    
    @Test
    public void solution() {
        MultipleOfN1 test = new MultipleOfN1();
        
        assertEquals(test.solution(98, 2), 1);
        assertEquals(test.solution(34, 3), 0);
    }
}