package level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumbersRemainderTest {
    @Test
    public void solution() {
        NumbersRemainder test = new NumbersRemainder();
        
        assertEquals(test.solution(3, 2), 1);
        assertEquals(test.solution(10, 5), 0);
    }
}