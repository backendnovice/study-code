package level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MakeArray5Test {
    
    @Test
    public void solution() {
        MakeArray5 test = new MakeArray5();
        
        assertArrayEquals(test.solution(new String[]{"0123456789","9876543210","9999999999999"}, 50000, 5, 5), new int[]{56789, 99999});
    }
}