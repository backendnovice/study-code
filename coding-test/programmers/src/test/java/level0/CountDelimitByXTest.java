package level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountDelimitByXTest {
    
    @Test
    public void solution() {
        CountDelimitByX test = new CountDelimitByX();
        
        assertArrayEquals(test.solution("oxooxoxxox"), new int[]{1, 2, 1, 0, 1, 0});
        assertArrayEquals(test.solution("xabcxdefxghi"), new int[]{0, 3, 3, 3});
    }
}