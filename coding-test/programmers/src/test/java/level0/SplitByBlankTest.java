package level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SplitByBlankTest {
    
    @Test
    public void solution() {
        SplitByBlank test = new SplitByBlank();
        
        assertArrayEquals(test.solution("i love you"), new String[]{"i", "love", "you"});
        assertArrayEquals(test.solution("programmers"), new String[]{"programmers"});
    }
}