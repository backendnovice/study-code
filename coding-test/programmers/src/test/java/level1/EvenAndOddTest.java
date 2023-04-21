package level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EvenAndOddTest {
    
    @Test
    public void solution() {
        EvenAndOdd test = new EvenAndOdd();
        
        assertEquals(test.solution(3), "Odd");
        assertEquals(test.solution(4), "Even");
    }
}