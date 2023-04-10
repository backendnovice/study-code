package level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IceAmericanoTest {
    
    @Test
    public void solution() {
        IceAmericano test = new IceAmericano();
        
        assertArrayEquals(test.solution(5500), new int[]{1, 0});
        assertArrayEquals(test.solution(15000), new int[]{2, 4000});
    }
}