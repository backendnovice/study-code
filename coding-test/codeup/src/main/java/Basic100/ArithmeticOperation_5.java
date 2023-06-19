package Basic100;

import java.util.Scanner;

public class ArithmeticOperation_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        long dividend = scanner.nextLong();
        long divisor = scanner.nextLong();
        
        System.out.print(dividend / divisor);
        
        scanner.close();
    }
}
