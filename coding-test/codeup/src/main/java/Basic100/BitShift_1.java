package Basic100;

import java.util.Scanner;

public class BitShift_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        long number = scanner.nextInt();
        
        System.out.print(number << 1);
        
        scanner.close();
    }
}
