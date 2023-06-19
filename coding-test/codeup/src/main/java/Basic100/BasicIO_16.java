package Basic100;

import java.util.Arrays;
import java.util.Scanner;

public class BasicIO_16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] inputs = Arrays
                .stream(scanner.next().split(":"))
                .mapToInt(Integer::parseInt)
                .toArray();
        
        System.out.print(inputs[1]);
        
        scanner.close();
    }
}
