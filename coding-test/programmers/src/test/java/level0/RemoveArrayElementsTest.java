package level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveArrayElementsTest {
    
    @Test
    public void solution() {
        RemoveArrayElements test = new RemoveArrayElements();
        
        assertArrayEquals(test.solution(new int[]{293, 1000, 395, 678, 94}, new int[]{94, 777, 104, 1000, 1, 12}), new int[]{293, 395, 678});
        assertArrayEquals(test.solution(new int[]{110, 66, 439, 785, 1}, new int[]{377, 823, 119, 43}), new int[]{110, 66, 439, 785, 1});
    }
}