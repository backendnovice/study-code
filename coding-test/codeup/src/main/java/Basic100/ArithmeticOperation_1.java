package Basic100;

import java.util.Scanner;

public class ArithmeticOperation_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        
        System.out.print((long) number1 + number2);
        
        scanner.close();
    }
}
