package level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FractionsAdditionTest {
    
    @Test
    public void solution() {
        FractionsAddition test = new FractionsAddition();
        
        assertArrayEquals(test.solution(1, 2, 3, 4), new int[]{5, 4});
        assertArrayEquals(test.solution(9, 2, 1, 3), new int[]{29, 6});
    }
}