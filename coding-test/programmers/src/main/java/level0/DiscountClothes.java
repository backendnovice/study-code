package level0;

public class DiscountClothes {
    public int solution(int price) {
        if(price >= Spent.high.getPrice()) {
            return price *= Discount.high.getRate();
        }
        if(price >= Spent.medium.getPrice()) {
            return price *= Discount.medium.getRate();
        }
        if(price >= Spent.low.getPrice()) {
            return price *= Discount.low.getRate();
        }
        
        return price;
    }
    
    enum Spent {
        high(500000), medium(300000), low(100000);
        
        private final int price;
        
        Spent(int price) {
            this.price = price;
        }
        
        public int getPrice() {
            return price;
        }
    }
    
    enum Discount {
        high(0.8), medium(0.9), low(0.95);
        
        private final double rate;
        
        Discount(double rate) {
            this.rate = rate;
        }
        
        public double getRate() {
            return rate;
        }
    }
}
