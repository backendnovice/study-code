package level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumbersAdditionTest {
    @Test
    public void solution() {
        NumbersAddition test = new NumbersAddition();
        
        assertEquals(test.solution(2, 3), 5);
        assertEquals(test.solution(100, 2), 102);
    }
}