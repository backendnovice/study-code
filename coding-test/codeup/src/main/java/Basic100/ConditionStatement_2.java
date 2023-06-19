package Basic100;

import java.util.Scanner;

public class ConditionStatement_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();
        
        printEvenOdd(number1);
        printEvenOdd(number2);
        printEvenOdd(number3);
        
        scanner.close();
    }
    
    private static void printEvenOdd(int number) {
        if(number % 2 == 0)
            System.out.println("even");
        else
            System.out.println("odd");
    }
}
