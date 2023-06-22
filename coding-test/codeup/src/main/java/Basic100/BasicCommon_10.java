package Basic100;

import java.util.Scanner;

public class BasicCommon_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int limit = scanner.nextInt();
        int total = 0, number = 1;
        
        while(total < limit) {
            total += number;
            number++;
        }
        
        System.out.print(total);
        
        scanner.close();
    }
}
