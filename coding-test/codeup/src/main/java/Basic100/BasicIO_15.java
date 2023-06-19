package Basic100;

import java.util.Arrays;
import java.util.Scanner;

public class BasicIO_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] numbers = Arrays
                .stream(scanner.next().split(""))
                .mapToInt(Integer::parseInt)
                .toArray();
        
        int digit = 10000;
        
        for(int i = 0; i < numbers.length; i++) {
            System.out.println("[" + numbers[i] * digit + "]");
            digit /= 10;
        }
        
        scanner.close();
    }
}
