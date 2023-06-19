package Basic100;

import java.util.Scanner;

public class LogicalOperation_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        boolean isZero = scanner.nextInt() == 0;
        
        if (isZero)
            System.out.print(1);
        else
            System.out.print(0);
        
        scanner.close();
    }
}
