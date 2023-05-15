package level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConvertArrayByLengthTest {
    
    @Test
    public void solution() {
        ConvertArrayByLength test = new ConvertArrayByLength();
        
        assertArrayEquals(test.solution(new int[]{49, 12, 100, 276, 33}, 27), new int[]{76, 12, 127, 276, 60});
        assertArrayEquals(test.solution(new int[]{444, 555, 666, 777}, 100), new int[]{444, 655, 666, 877});
    }
}