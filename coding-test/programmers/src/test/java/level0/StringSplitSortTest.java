package level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringSplitSortTest {
    
    @Test
    public void solution() {
        StringSplitSort test = new StringSplitSort();
        
        assertArrayEquals(test.solution("axbxcxdx"), new String[]{"a", "b", "c", "d"});
        assertArrayEquals(test.solution("dxccxbbbxaaaa"), new String[]{"aaaa","bbb","cc","d"});
        assertArrayEquals(test.solution("a axddd"), new String[]{"a a", "ddd"});
        
    }
}