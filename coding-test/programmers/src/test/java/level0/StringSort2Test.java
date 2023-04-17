package level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringSort2Test {
    
    @Test
    public void solution() {
        StringSort2 test = new StringSort2();
        
        assertEquals(test.solution("Bcad"), "abcd");
        assertEquals(test.solution("heLLo"), "ehllo");
        assertEquals(test.solution("Python"), "hnopty");
    }
}