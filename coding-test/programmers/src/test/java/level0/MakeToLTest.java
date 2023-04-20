package level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MakeToLTest {
    
    @Test
    public void solution() {
        MakeToL test = new MakeToL();
        
        assertEquals(test.solution("abcdevwxyz"), "lllllvwxyz");
        assertEquals(test.solution("jjnnllkkmm"), "llnnllllmm");
    }
}