package level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChickenCouponTest {
    
    @Test
    public void solution() {
        ChickenCoupon test = new ChickenCoupon();
        
        assertEquals(test.solution(100), 11);
        assertEquals(test.solution(1081), 120);
    }
}