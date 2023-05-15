package level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlienDictionaryTest {
    
    @Test
    public void solution() {
        AlienDictionary test = new AlienDictionary();
        
        assertEquals(test.solution(new String[]{"p", "o", "s"}, new String[]{"sod", "eocd", "qixm", "adio", "soo"}), 2);
        assertEquals(test.solution(new String[]{"z", "d", "x"}, new String[]{"def", "dww", "dzx", "loveaw"}), 1);
        assertEquals(test.solution(new String[]{"s", "o", "m", "d"}, new String[]{"moos", "dzx", "smm", "sunmmo", "som"}), 2);
    }
}