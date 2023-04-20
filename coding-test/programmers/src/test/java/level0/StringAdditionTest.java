package level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringAdditionTest {
    
    @Test
    public void solution() {
        StringAddition test = new StringAddition();
        
        assertEquals(test.solution("582", "734"), "1316");
        assertEquals(test.solution("18446744073709551615", "287346502836570928366"), "305793246910280479981");
        assertEquals(test.solution("0", "0"), "0");
    }
}