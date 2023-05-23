package level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GetDaysOfWeekTest {
    
    @Test
    public void solution() {
        GetDaysOfWeek test = new GetDaysOfWeek();
        
        assertEquals(test.solution(5, 24), "TUE");
    }
}