package Basic100;

import java.util.Scanner;

public class BitLogicalOperation_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int number = scanner.nextInt();
        
        System.out.print(~number);
        
        scanner.close();
    }
}
