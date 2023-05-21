package level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SecretMapTest {
    
    @Test
    public void solution() {
        SecretMap test = new SecretMap();
        
        assertArrayEquals(test.solution(5, new int[]{9, 20, 28, 18, 11}, new int[]{30, 1, 21, 17, 28}), new String[]{"#####","# # #", "### #", "#  ##", "#####"});
    }
}