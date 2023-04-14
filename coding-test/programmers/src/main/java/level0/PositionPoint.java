package level0;

public class PositionPoint {
    public int solution(int[] points) {
        final int positionX = points[0];
        final int positionY = points[1];
        
        if(positionX > 0) {
            return (positionY > 0) ? 1 : 4;
        }else {
            return (positionY > 0) ? 2 : 3;
        }
    }
}
