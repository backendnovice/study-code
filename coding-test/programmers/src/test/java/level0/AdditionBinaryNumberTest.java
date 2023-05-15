package level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdditionBinaryNumberTest {
    
    @Test
    public void solution() {
        AdditionBinaryNumber test = new AdditionBinaryNumber();
        
        assertEquals(test.solution("10", "11"), "101");
        assertEquals(test.solution("1001", "1111"), "11000");
    }
}