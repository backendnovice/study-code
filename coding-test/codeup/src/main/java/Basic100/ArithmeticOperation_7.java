package Basic100;

import java.util.Scanner;

public class ArithmeticOperation_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        long number = scanner.nextLong();
        
        System.out.print(++number);
        
        scanner.close();
    }
}
