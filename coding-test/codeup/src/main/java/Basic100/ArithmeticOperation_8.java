package Basic100;

import java.util.Scanner;

public class ArithmeticOperation_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        long number1 = scanner.nextLong();
        long number2 = scanner.nextLong();
        
        System.out.print((number1 + number2) + "\n" + (number1 - number2) + "\n" + (number1 * number2) + "\n"
                + (number1 / number2) + "\n" + (number1 % number2) + "\n" + String.format("%.2f", (double)number1 / number2));
        
        scanner.close();
    }
}
