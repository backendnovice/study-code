package level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpecialArrayTest {
    
    @Test
    public void solution() {
        SpecialArray test = new SpecialArray();
        
        assertEquals(test.solution(new int[][]{{5, 192, 33}, {192, 72, 95}, {33, 95, 999}}), 1);
        assertEquals(test.solution(new int[][]{{19, 498, 258, 587}, {63, 93, 7, 754}, {258, 7, 1000, 723}, {587, 754, 723, 81}}), 0);
    }
}