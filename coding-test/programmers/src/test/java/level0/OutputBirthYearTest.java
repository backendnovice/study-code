package level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OutputBirthYearTest {
    @Test
    public void solution() {
        OutputBirthYear test = new OutputBirthYear();
        
        assertEquals(test.solution(40), 1983);
        assertEquals(test.solution(23), 2000);
    }
}