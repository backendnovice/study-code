package Basic100;

import java.util.Scanner;

public class ConditionStatement_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int number = scanner.nextInt();
    
        printPlusMinus(number);
        printOddEven(number);
        
        scanner.close();
    }
    
    private static void printPlusMinus(int number) {
        if(number >= 0)
            System.out.println("plus");
        else
            System.out.println("minus");
    }
    
    private static void printOddEven(int number) {
        if(number % 2 == 0)
            System.out.print("even");
        else
            System.out.print("odd");
    }
}
