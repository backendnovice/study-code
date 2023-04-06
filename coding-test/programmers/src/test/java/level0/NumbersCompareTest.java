package level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumbersCompareTest {
    
    @Test
    public void solution() {
        NumbersCompare test = new NumbersCompare();
        
        assertEquals(test.solution(2, 3), -1);
        assertEquals(test.solution(11, 11), 1);
        assertEquals(test.solution(7, 99), -1);
    }
}