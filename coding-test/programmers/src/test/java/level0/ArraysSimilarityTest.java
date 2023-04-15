package level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArraysSimilarityTest {
    
    @Test
    public void solution() {
        ArraysSimilarity test = new ArraysSimilarity();
        
        assertEquals(test.solution(new String[]{"a", "b", "c"}, new String[]{"com", "b", "d", "p", "c"}), 2);
        assertEquals(test.solution(new String[]{"n", "omg"}, new String[]{"m", "dot"}), 0);
    }
}