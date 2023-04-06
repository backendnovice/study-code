package level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumbersQuotientTest {
    @Test
    public void solution() {
        NumbersQuotient test = new NumbersQuotient();
        
        assertEquals(test.solution(10, 5), 2);
        assertEquals(test.solution(7, 2), 3);
    }
}