package Basic100;

import java.util.Scanner;

public class BasicIO_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int input = scanner.nextInt();
        
        System.out.print(input + " " + input + " " + input);
        
        scanner.close();
    }
}
