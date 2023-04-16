package level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringSortTest {
    
    @Test
    public void solution() {
        StringSort test = new StringSort();
        
        assertArrayEquals(test.solution("hi12392"), new int[]{1, 2, 2, 3, 9});
        assertArrayEquals(test.solution("p2o4i8gj2"), new int[]{2, 2, 4, 8});
        assertArrayEquals(test.solution("abcde0"), new int[]{0});
    }
}