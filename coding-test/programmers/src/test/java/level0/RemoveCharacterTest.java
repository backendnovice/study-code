package level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveCharacterTest {
    
    @Test
    public void solution() {
        RemoveCharacter test = new RemoveCharacter();
        
        assertEquals(test.solution("apporoograpemmemprs", new int[]{1, 16, 6, 15, 0, 10, 11, 3}), "programmers");
    }
}