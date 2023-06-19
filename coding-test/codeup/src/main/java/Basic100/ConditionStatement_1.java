package Basic100;

import java.util.Scanner;

public class ConditionStatement_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();
        
        if(number1 % 2 == 0)
            System.out.println(number1);
        if(number2 % 2 == 0)
            System.out.println(number2);
        if(number3 % 2 == 0)
            System.out.println(number3);
        
        scanner.close();
    }
}
