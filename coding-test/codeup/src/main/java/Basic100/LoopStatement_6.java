package Basic100;

import java.util.Scanner;

public class LoopStatement_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        char alphabet = scanner.next().charAt(0);
        
        for (int i = 'a'; i <= alphabet; i++)
            System.out.print((char) i + " ");
        
        scanner.close();
    }
}
