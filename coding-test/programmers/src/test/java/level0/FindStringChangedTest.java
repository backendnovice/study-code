package level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindStringChangedTest {
    
    @Test
    public void solution() {
        FindStringChanged test = new FindStringChanged();
        
        assertEquals(test.solution("ABBAA", "AABB"), 1);
        assertEquals(test.solution("ABAB", "ABAB"), 0);
    }
}