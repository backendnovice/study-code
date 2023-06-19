package Basic100;

import java.util.Scanner;

public class TernaryOperation_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int result = Math.max(number1, number2);
        
        System.out.print(result);
        
        scanner.close();
    }
}
