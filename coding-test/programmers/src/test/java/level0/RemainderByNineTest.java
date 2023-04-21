package level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemainderByNineTest {
    
    @Test
    public void solution() {
        RemainderByNine test = new RemainderByNine();
        
        assertEquals(test.solution("123"), 6);
        assertEquals(test.solution("78720646226947352489"), 2);
    }
}