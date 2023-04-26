package level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CharactersToStringTest {
    
    @Test
    public void solution() {
        CharactersToString test = new CharactersToString();
        
        assertEquals(test.solution("cvsgiorszzzmrpaqpe", new int[]{16, 6, 5, 3, 12, 14, 11, 11, 17, 12, 7}), "programmers");
        assertEquals(test.solution("zpiaz", new int[]{1, 2, 0, 0, 3}), "pizza");
    }
}