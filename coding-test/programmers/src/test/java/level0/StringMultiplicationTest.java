package level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringMultiplicationTest {
    
    @Test
    public void solution() {
        StringMultiplication test = new StringMultiplication();
        
        assertEquals(test.solution("string", 3), "stringstringstring");
        assertEquals(test.solution("love", 10), "lovelovelovelovelovelovelovelovelovelove");
    }
}