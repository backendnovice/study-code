package Basic100;

import java.util.Scanner;

public class LoopStatement_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int count = scanner.nextInt();
        
        for(int i = 0; i < count; i++) {
            int number = scanner.nextInt();
            System.out.println(number);
        }
        
        scanner.close();
    }
}
