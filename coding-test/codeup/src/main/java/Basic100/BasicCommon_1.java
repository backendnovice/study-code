package Basic100;

import java.util.Scanner;
import java.util.stream.IntStream;

public class BasicCommon_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int limit = scanner.nextInt();
        
        System.out.print(IntStream
                .rangeClosed(1, limit)
                .filter(i -> i % 2 == 0)
                .sum());
        
        scanner.close();
    }
}
