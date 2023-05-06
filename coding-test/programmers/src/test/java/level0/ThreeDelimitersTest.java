package level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ThreeDelimitersTest {
    
    @Test
    public void solution() {
        ThreeDelimiters test = new ThreeDelimiters();
        
        assertArrayEquals(test.solution("baconlettucetomato"), new String[]{"onlettu", "etom", "to"});
        assertArrayEquals(test.solution("abcd"), new String[]{"d"});
        assertArrayEquals(test.solution("cabab"), new String[]{"EMPTY"});
        
    }
}