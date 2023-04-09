package level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HateEvenNumberTest {
    
    @Test
    public void solution() {
        HateEvenNumber test = new HateEvenNumber();
        
        assertArrayEquals(test.solution(10), new int[]{1, 3, 5, 7, 9});
        assertArrayEquals(test.solution(15), new int[]{1, 3, 5, 7, 9, 11, 13, 15});
    }
}