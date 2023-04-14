package level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveVowelsTest {
    
    @Test
    public void solution() {
        RemoveVowels test = new RemoveVowels();
        
        assertEquals(test.solution("bus"), "bs");
        assertEquals(test.solution("nice to meet you"), "nc t mt y");
    }
}