package level1;

import java.util.stream.IntStream;

public class MeasureCountSum {
    public int solution(int left, int right) {
        return IntStream.rangeClosed(left, right).map(this::checkMeasure).sum();
    }
    
    private int checkMeasure(int number) {
        int count = (int) IntStream.rangeClosed(1, number).filter(i -> number % i == 0).count();
        
        return (count % 2 == 0) ? number : -number;
    }
}
