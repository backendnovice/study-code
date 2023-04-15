package level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringInStringTest {
    
    @Test
    public void solution() {
        StringInString test = new StringInString();
        
        assertEquals(test.solution("ab6CDE443fgh22iJKlmn1o", "6CD"), 1);
        assertEquals(test.solution("ppprrrogrammers", "pppp"), 2);
        assertEquals(test.solution("AbcAbcA", "AAA"), 2);
    }
}