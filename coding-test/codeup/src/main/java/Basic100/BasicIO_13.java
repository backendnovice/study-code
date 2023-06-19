package Basic100;

import java.util.Arrays;
import java.util.Scanner;

public class BasicIO_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] input = Arrays
                .stream(scanner.next().split("[.]"))
                .mapToInt(Integer::parseInt)
                .toArray();
        
        System.out.print(String.format("%d\n%d", input[0], input[1]));
        
        scanner.close();
    }
}
