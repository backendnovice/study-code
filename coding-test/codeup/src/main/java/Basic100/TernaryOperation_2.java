package Basic100;

import java.util.Scanner;

public class TernaryOperation_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();
        
        System.out.print(Math.min(number1, Math.min(number2, number3)));
        
        scanner.close();
    }
}
