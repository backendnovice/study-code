package level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumbersSquareTest {
    
    @Test
    public void solution() {
        NumbersSquare test = new NumbersSquare();
        
        assertEquals(test.solution(144), 1);
        assertEquals(test.solution(976), 2);
    }
}