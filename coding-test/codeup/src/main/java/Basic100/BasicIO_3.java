package Basic100;

import java.util.Scanner;

public class BasicIO_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        float input = scanner.nextFloat();
        
        System.out.print(String.format("%.6f", input));
        
        scanner.close();
    }
}
