package level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArraysSplitTest {
    
    @Test
    public void solution() {
        ArraysSplit test = new ArraysSplit();
        
        assertArrayEquals(test.solution("abc1Addfggg4556b", 6), new String[]{"abc1Ad", "dfggg4", "556b"});
        assertArrayEquals(test.solution("abcdef123", 3), new String[]{"abc", "def", "123"});
    }
}