package level0;

import java.util.Scanner;
import java.util.stream.IntStream;

public class OutputRightTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
    
        IntStream.rangeClosed(1, n).forEach(i -> {
            IntStream.rangeClosed(1, i).forEach(j -> {
                System.out.print("*");
            });
            System.out.print("\n");
        });
        
        scanner.close();
    }
}
