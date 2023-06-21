package Basic100;

import java.util.Scanner;

public class BasicCommon_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int dice1 = scanner.nextInt();
        int dice2 = scanner.nextInt();
        
        for(int i = 1; i <= dice1; i++) {
            for(int j = 1; j <= dice2; j++) {
                System.out.println(i + " " + j);
            }
        }
        
        scanner.close();
    }
}
