package Basic100;

import java.util.Scanner;

public class BasicIO_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        char input = scanner.next().charAt(0);
        
        System.out.print(input);
        
        scanner.close();
    }
}
