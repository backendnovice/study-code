package level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HidePhoneNumberTest {
    
    @Test
    public void solution() {
        HidePhoneNumber test = new HidePhoneNumber();
        
        assertEquals(test.solution("01033334444"), "*******4444");
        assertEquals(test.solution("027778888"), "*****8888");
    }
}