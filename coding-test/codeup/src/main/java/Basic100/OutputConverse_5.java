package Basic100;

import java.util.Scanner;

public class OutputConverse_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int number = Integer.parseInt(scanner.next(), 16);
        
        System.out.print(String.format("%o", number));
        
        scanner.close();
    }
}
