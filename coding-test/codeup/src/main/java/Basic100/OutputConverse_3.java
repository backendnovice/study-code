package Basic100;

import java.util.Scanner;

public class OutputConverse_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int number = scanner.nextInt();
        
        System.out.print(String.format("%X", number));
        
        scanner.close();
    }
}
