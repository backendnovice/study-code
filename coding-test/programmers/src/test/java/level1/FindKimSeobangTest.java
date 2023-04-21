package level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindKimSeobangTest {
    
    @Test
    public void solution() {
        FindKimSeobang test = new FindKimSeobang();
        
        assertEquals(test.solution(new String[]{"Jane", "Kim"}), "김서방은 1에 있다");
    }
}