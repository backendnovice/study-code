package level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiscountClothesTest {
    
    @Test
    public void solution() {
        DiscountClothes test = new DiscountClothes();
        
        assertEquals(test.solution(150000), 142500);
        assertEquals(test.solution(580000), 464000);
        assertEquals(test.solution(1000000), 800000);
    }
}