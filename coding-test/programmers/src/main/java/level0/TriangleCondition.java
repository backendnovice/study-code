package level0;

import java.util.Arrays;

public class TriangleCondition {
    public int solution(int[] sides) {
        Arrays.sort(sides);
        
        final int HYPOTENUSE = sides[2];
        final int SUMOTHERS = sides[0] + sides[1];
        
        return (SUMOTHERS > HYPOTENUSE) ? 1 : 2;
    }
}
