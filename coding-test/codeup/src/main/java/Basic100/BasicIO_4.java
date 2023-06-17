package Basic100;

import java.util.Scanner;

public class BasicIO_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int input1 = scanner.nextInt();
        int input2 = scanner.nextInt();
        
        System.out.print(input1 + " " + input2);
        
        scanner.close();
    }
}
