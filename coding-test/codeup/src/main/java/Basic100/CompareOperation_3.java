package Basic100;

import java.util.Scanner;

public class CompareOperation_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        
        if(number1 <= number2)
            System.out.print(1);
        else
            System.out.print(0);
        
        scanner.close();
    }
}
