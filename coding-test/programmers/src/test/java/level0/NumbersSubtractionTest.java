package level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumbersSubtractionTest {
    @Test
    public void solution() {
        NumbersSubtraction test = new NumbersSubtraction();
        
        assertEquals(test.solution(2, 3), -1);
        assertEquals(test.solution(100, 2), 98);
    }
}