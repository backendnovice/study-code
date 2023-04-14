package level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ElementsLengthTest {
    
    @Test
    public void solution() {
        ElementsLength test = new ElementsLength();
        
        assertArrayEquals(test.solution(new String[]{"We", "are", "the", "world!"}), new int[]{2, 3, 3, 6});
        assertArrayEquals(test.solution(new String[]{"I", "Love", "Programmers."}), new int[]{1, 4, 12});
    }
}