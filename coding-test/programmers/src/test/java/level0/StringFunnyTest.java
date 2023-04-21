package level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringFunnyTest {
    
    @Test
    public void solution() {
        StringFunny test = new StringFunny();
        
        assertEquals(test.solution("masterpiece"), "rnasterpiece");
        assertEquals(test.solution("programmers"), "prograrnrners");
        assertEquals(test.solution("jerry"), "jerry");
        assertEquals(test.solution("burn"), "burn");
    }
}