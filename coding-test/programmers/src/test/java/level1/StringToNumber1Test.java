package level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringToNumber1Test {
    
    @Test
    public void solution() {
        StringToNumber1 test = new StringToNumber1();
        
        assertEquals(test.solution("1234"), 1234);
        assertEquals(test.solution("-1234"), -1234);
    }
}