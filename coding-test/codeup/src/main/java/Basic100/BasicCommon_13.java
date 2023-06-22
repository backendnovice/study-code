package Basic100;

import java.util.Scanner;

public class BasicCommon_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        long number = scanner.nextInt();
        int factor = scanner.nextInt();
        int index = scanner.nextInt();
        
        for(int i = 1; i < index; i++)
            number *= factor;
        System.out.print(number);
        
        scanner.close();
    }
}
