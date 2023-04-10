package level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringReverseTest {
    
    @Test
    public void solution() {
        StringReverse test = new StringReverse();
        
        assertEquals(test.solution("jaron"), "noraj");
        assertEquals(test.solution("bread"), "daerb");
    }
}