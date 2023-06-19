package Basic100;

import java.util.Scanner;

public class BitShift_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int number = scanner.nextInt();
        int power = scanner.nextInt();
        
        System.out.print(number * (1 << power));
        
        scanner.close();
    }
}
