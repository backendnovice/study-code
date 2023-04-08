package level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindMedianNumberTest {
    @Test
    public void solution() {
        FindMedianNumber test = new FindMedianNumber();
        
        assertEquals(test.solution(new int[]{1, 2, 7, 10, 11}), 7);
        assertEquals(test.solution(new int[]{9, -1, 0}), 0);
    }
}