package Basic100;

import java.util.Arrays;
import java.util.Scanner;

public class BasicIO_17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] inputs = Arrays
                .stream(scanner.next().split("[.]"))
                .mapToInt(Integer::parseInt)
                .toArray();
        
        System.out.print(String.format("%02d-%02d-%02d", inputs[2], inputs[1], inputs[0]));
        
        scanner.close();
    }
}
