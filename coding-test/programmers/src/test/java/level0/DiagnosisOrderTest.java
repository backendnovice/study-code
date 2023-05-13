package level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiagnosisOrderTest {
    
    @Test
    public void solution() {
        DiagnosisOrder test = new DiagnosisOrder();
        
        assertArrayEquals(test.solution(new int[]{3, 76, 24}), new int[]{3, 1, 2});
        assertArrayEquals(test.solution(new int[]{1, 2, 3, 4, 5, 6, 7}), new int[]{7, 6, 5, 4, 3, 2, 1});
        assertArrayEquals(test.solution(new int[]{30, 10, 23, 6, 100}), new int[]{2, 4, 3, 5, 1});
    }
}