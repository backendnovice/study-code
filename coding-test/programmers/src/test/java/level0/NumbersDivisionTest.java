package level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumbersDivisionTest {
    @Test
    public void solution() {
        NumbersDivision test = new NumbersDivision();
        
        assertEquals(test.solution(3, 2), 1500);
        assertEquals(test.solution(7, 3), 2333);
        assertEquals(test.solution(1, 16), 62);
    }
}