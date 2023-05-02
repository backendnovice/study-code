package level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ControlNumberTest {
    
    @Test
    public void solution() {
        ControlNumber test = new ControlNumber();
        
        assertEquals(test.solution(0, "wsdawsdassw"), -1);
    }
}