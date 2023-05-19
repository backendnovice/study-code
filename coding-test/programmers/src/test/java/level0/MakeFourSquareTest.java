package level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MakeFourSquareTest {
    
    @Test
    public void solution() {
        MakeFourSquare test = new MakeFourSquare();
        
        assertArrayEquals(test.solution(new int[][]{{572, 22, 37}, {287, 726, 384}, {85, 137, 292}, {487, 13, 876}}), new int[][]{{572, 22, 37, 0}, {287, 726, 384, 0}, {85, 137, 292, 0}, {487, 13, 876, 0}});
        assertArrayEquals(test.solution(new int[][]{{57, 192, 534, 2}, {9, 345, 192, 999}}), new int[][]{{57, 192, 534, 2}, {9, 345, 192, 999}, {0, 0, 0, 0}, {0, 0, 0, 0}});
    }
}