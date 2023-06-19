package Basic100;

import java.util.Scanner;

public class ArithmeticOperation_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int alphabet = scanner.next().charAt(0) + 1;
        
        System.out.print((char) alphabet);
        
        scanner.close();
    }
}
