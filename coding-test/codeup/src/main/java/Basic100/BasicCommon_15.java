package Basic100;

import java.util.Scanner;

public class BasicCommon_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int cycle1 = scanner.nextInt();
        int cycle2 = scanner.nextInt();
        int cycle3 = scanner.nextInt();
        int day = 1;
        
        while(day % cycle1 != 0 || day % cycle2 != 0 || day % cycle3 != 0)
            day++;
        
        System.out.print(day);
        
        scanner.close();
    }
}
