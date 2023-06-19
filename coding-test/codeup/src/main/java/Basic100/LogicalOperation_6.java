package Basic100;

import java.util.Scanner;

public class LogicalOperation_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        boolean isFalse1 = scanner.nextInt() == 0;
        boolean isFalse2 = scanner.nextInt() == 0;
        
        if(isFalse1 && isFalse2)
            System.out.print(1);
        else
            System.out.print(0);
        
        scanner.close();
    }
}
