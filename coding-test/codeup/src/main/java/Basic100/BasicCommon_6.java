package Basic100;

import java.util.Scanner;

public class BasicCommon_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int limit = scanner.nextInt();
        
        for(int i = 1; i <= limit; i++) {
            if(i % 3 == 0)
                System.out.print("X ");
            else
                System.out.print(i + " ");
        }
        
        scanner.close();
    }
}