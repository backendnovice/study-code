package level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MakeLowerCaseTest {
    
    @Test
    public void solution() {
        MakeLowerCase test = new MakeLowerCase();
        
        assertEquals(test.solution("aBcDeFg"), "abcdefg");
        assertEquals(test.solution("aaa"), "aaa");
    }
}