package level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SuffixArrayTest {
    
    @Test
    public void solution() {
        SuffixArray test = new SuffixArray();
        
        assertArrayEquals(test.solution("banana"), new String[]{"a", "ana", "anana", "banana", "na", "nana"});
        assertArrayEquals(test.solution("programmers"), new String[]{"ammers", "ers", "grammers", "mers", "mmers", "ogrammers", "programmers", "rammers", "rogrammers", "rs", "s"});
    }
}