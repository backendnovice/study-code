package Basic100;

import java.util.Scanner;

public class BasicIO_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String input = scanner.next();
        
        System.out.print(String.join("", input.split("-")));
        
        scanner.close();
    }
}
