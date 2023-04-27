package level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccentATest {
    
    @Test
    public void solution() {
        AccentA test = new AccentA();
        
        assertEquals(test.solution("abstract algebra"), "AbstrAct AlgebrA");
        assertEquals(test.solution("PrOgRaMmErS"), "progrAmmers");
    }
}