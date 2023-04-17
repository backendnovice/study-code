package level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HateEnglishTest {
    
    @Test
    public void solution() {
        HateEnglish test = new HateEnglish();
        
        assertEquals(test.solution("onetwothreefourfivesixseveneightnine"), 123456789);
        assertEquals(test.solution("onefourzerosixseven"), 14067);
    }
}