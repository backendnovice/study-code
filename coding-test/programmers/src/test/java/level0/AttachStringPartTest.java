package level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AttachStringPartTest {
    
    @Test
    public void solution() {
        AttachStringPart test = new AttachStringPart();
        
        assertEquals(test.solution(new String[]{"progressive", "hamburger", "hammer", "ahocorasick"}, new int[][]{{0, 4}, {1, 2}, {3, 5}, {7, 7}}), "programmers");
    }
}