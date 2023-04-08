package level0;

public class Protractor {
    public int solution(int angle) {
        if(angle <= 90)
            return (angle == 90) ? Angle.RIGHT.getValue() : Angle.ACUTE.getValue();
        else
            return (angle == 180) ? Angle.STRAIGHT.getValue() : Angle.OBTUSE.getValue();
    }
    
    enum Angle {
        ACUTE(1), RIGHT(2), OBTUSE(3), STRAIGHT(4);
        
        private final int value;
        Angle(int value) {
            this.value = value;
        }
        
        public int getValue() {
            return value;
        }
    }
}
