package Basic100;

import java.util.Scanner;

public class LogicalOperation_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        boolean isTrue1 = scanner.nextInt() == 1;
        boolean isTrue2 = scanner.nextInt() == 1;
        
        if(isTrue1 || isTrue2)
            System.out.print(1);
        else
            System.out.print(0);
        
        scanner.close();
    }
}
