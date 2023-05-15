package level0;

import java.util.Scanner;

public class PrintAB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        
        System.out.println("a = " + a + "\n" + "b = " + b);
        
        scanner.close();
    }
}
