package level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AtFivePersonTest {
    
    @Test
    void solution() {
        AtFivePerson test = new AtFivePerson();
        
        assertArrayEquals(test.solution(new String[]{"nami", "ahri", "jayce", "garen", "ivern", "vex", "jinx"}), new String[]{"nami", "vex"});
    }
}