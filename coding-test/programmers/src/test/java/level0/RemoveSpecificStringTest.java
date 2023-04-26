package level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveSpecificStringTest {
    
    @Test
    public void solution() {
        RemoveSpecificString test = new RemoveSpecificString();
        
        assertArrayEquals(test.solution(new String[]{"and", "notad", "abcd"}), new String[]{"and", "abcd"});
        assertArrayEquals(test.solution(new String[]{"there", "are", "no", "a", "ds"}), new String[]{"there", "are", "no", "a", "ds"});
    }
}