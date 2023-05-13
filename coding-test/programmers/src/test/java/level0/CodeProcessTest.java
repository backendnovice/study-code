package level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CodeProcessTest {
    
    @Test
    public void solution() {
        CodeProcess test = new CodeProcess();
        
        assertEquals(test.solution("abc1abc1abc"), "acbac");
    }
}