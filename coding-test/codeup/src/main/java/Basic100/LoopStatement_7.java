package Basic100;

import java.util.Scanner;

public class LoopStatement_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int number = scanner.nextInt();
        
        for(int i = 0; i <= number; i++)
            System.out.println(i);
        
        scanner.close();
    }
}
