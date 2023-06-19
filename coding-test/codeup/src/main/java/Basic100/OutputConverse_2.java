package Basic100;

import java.util.Scanner;

public class OutputConverse_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int number = scanner.nextInt();
        
        System.out.print(String.format("%x", number));
        
        scanner.close();
    }
}
