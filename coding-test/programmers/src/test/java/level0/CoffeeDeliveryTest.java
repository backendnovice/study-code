package level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CoffeeDeliveryTest {
    
    @Test
    public void solution() {
        CoffeeDelivery test = new CoffeeDelivery();
        
        assertEquals(test.solution(new String[]{"cafelatte", "americanoice", "hotcafelatte", "anything"}), 19000);
        assertEquals(test.solution(new String[]{"americanoice", "americano", "iceamericano"}), 13500);
    }
}