package Basic100;

import java.util.Scanner;

public class ArithmeticOperation_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();
        
        System.out.println((long) number1 + number2 + number3);
        System.out.print(String.format("%.1f", ((double) number1 + number2 + number3) / 3));
        
        scanner.close();
    }
}
