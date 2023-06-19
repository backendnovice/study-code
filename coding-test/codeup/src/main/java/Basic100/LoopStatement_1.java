package Basic100;

import java.util.Scanner;

public class LoopStatement_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while(true) {
            int number = scanner.nextInt();
            
            if(number == 0)
                break;
            else
                System.out.println(number);
        }
        
        scanner.close();
    }
}
