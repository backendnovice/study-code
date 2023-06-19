package Basic100;

import java.util.Scanner;

public class LoopStatement_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int number = scanner.nextInt();
        
        while(number > 0) {
            System.out.println(--number);
        }
        
        scanner.close();
    }
}
