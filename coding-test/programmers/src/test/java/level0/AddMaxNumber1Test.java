package level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddMaxNumber1Test {
    
    @Test
    void solution() {
        AddMaxNumber1 test = new AddMaxNumber1();
        
        assertEquals(test.solution(new int[] {1, 2, -3, 4, -5}), 15);
        assertEquals(test.solution(new int[] {0, -31, 24, 10, 1, 9}), 240);
        assertEquals(test.solution(new int[] {10, 20, 30, 5, 5, 20, 5}), 600);
    }
}