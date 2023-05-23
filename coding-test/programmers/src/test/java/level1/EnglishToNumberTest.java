package level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EnglishToNumberTest {
    
    @Test
    public void solution() {
        EnglishToNumber test = new EnglishToNumber();
        
        assertEquals(test.solution("one4seveneight"), 1478);
        assertEquals(test.solution("23four5six7"), 234567);
        assertEquals(test.solution("2three45sixseven"), 234567);
        assertEquals(test.solution("123"), 123);
    }
}