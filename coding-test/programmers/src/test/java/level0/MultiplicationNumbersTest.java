package level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultiplicationNumbersTest {
    @Test
    public void solution() {
        NumbersMultiplication test = new NumbersMultiplication();
        
        assertEquals(test.solution(3, 4), 12);
        assertEquals(test.solution(27, 19), 513);
    }
}