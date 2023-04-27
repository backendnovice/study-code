package level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DelimitByBlankTest {
    
    @Test
    public void solution() {
        DelimitByBlank test = new DelimitByBlank();
        
        assertArrayEquals(test.solution("i    love  you"), new String[]{"i", "love", "you"});
        assertArrayEquals(test.solution("    programmers  "), new String[]{"programmers"});
    }
}