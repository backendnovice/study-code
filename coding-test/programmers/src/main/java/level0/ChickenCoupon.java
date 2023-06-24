package level0;

public class ChickenCoupon {
    public int solution(int chicken) {
        int total = 0, coupon = chicken;
        
        while(coupon >= 10) {
            int service = coupon / 10;
            total += service;
            coupon = coupon % 10 + service;
        }
        
        return total;
    }
}
