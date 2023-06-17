package Basic100;

import java.util.Scanner;

public class BasicIO_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        char input1 = scanner.next().charAt(0);
        char input2 = scanner.next().charAt(0);
        
        System.out.print(input2 + " " + input1);
        
        scanner.close();
    }
}
