package level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountUpTest {
    
    @Test
    public void solution() {
        CountUp test = new CountUp();
        
        assertArrayEquals(test.solution(3, 10), new int[]{3, 4, 5, 6, 7, 8, 9, 10});
    }
}