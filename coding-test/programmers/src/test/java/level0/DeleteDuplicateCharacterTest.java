package level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeleteDuplicateCharacterTest {
    
    @Test
    public void solution() {
        DeleteDuplicateCharacter test = new DeleteDuplicateCharacter();
    
        assertEquals(test.solution("people"), "peol");
        assertEquals(test.solution("We are the world"), "We arthwold");
    }
}