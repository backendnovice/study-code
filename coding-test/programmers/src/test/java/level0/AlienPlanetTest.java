package level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlienPlanetTest {
    
    @Test
    public void solution() {
        AlienPlanet test = new AlienPlanet();
        
        assertEquals(test.solution(23), "cd");
        assertEquals(test.solution(51), "fb");
        assertEquals(test.solution(100), "baa");
    }
}