package level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DistNumberRootTest {
    
    @Test
    public void solution() {
        FindKimSeobang.DistNumberRoot test = new FindKimSeobang.DistNumberRoot();
        
        assertEquals(test.solution(121), 144);
        assertEquals(test.solution(3), -1);
    }
}