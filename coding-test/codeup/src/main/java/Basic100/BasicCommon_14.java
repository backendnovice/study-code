package Basic100;

import java.util.Scanner;

public class BasicCommon_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        long number = scanner.nextInt();
        int factor = scanner.nextInt();
        int addend = scanner.nextInt();
        int index = scanner.nextInt();
        
        for(int i = 1; i < index; i++) {
            number = number * factor + addend;
        }
        System.out.print(number);
        
        scanner.close();
    }
}
