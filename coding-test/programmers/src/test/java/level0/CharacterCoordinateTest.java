package level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CharacterCoordinateTest {
    
    @Test
    public void solution() {
        CharacterCoordinate test = new CharacterCoordinate();
        
        assertArrayEquals(test.solution(new String[]{"left", "right", "up", "right", "right"}, new int[]{11, 11}), new int[]{2, 1});
        assertArrayEquals(test.solution(new String[]{"down", "down", "down", "down", "down"}, new int[]{7, 9}), new int[]{0, -4});
    }
}