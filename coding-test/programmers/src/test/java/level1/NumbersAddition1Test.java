package level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumbersAddition1Test {
    
    @Test
    public void solution() {
        NumbersAddition1 test = new NumbersAddition1();
        
        assertEquals(test.solution(3, 5), 12);
        assertEquals(test.solution(3, 3), 3);
        assertEquals(test.solution(5, 5), 5);
    }
}