package level0;

import java.util.Scanner;

public class PrintAdditionExpression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        System.out.print(a + " + " + b + " = " + (a + b));
    }
}
