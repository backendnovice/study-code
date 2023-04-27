package level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringMixTest {
    
    @Test
    public void solution() {
        StringMix test = new StringMix();
        
        assertEquals(test.solution("aaaaa", "bbbbb"), "ababababab");
    }
}