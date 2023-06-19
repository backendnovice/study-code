package Basic100;

import java.util.Scanner;

public class BitLogicalOperation_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        
        System.out.print(number1 & number2);
        
        scanner.close();
    }
}
