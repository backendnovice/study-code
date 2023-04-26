package level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExchangeUpperLowerCaseTest {
    
    @Test
    public void solution() {
        ExchangeUpperLowerCase test = new ExchangeUpperLowerCase();
        
        assertArrayEquals(test.solution(new String[]{"AAA", "BBB", "CCC", "DDD"}), new String[]{"aaa", "BBB", "ccc", "DDD"});
        assertArrayEquals(test.solution(new String[]{"aBc", "AbC"}), new String[]{"abc", "ABC"});
    }
}