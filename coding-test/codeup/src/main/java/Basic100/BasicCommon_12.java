package Basic100;

import java.util.Scanner;

public class BasicCommon_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int number = scanner.nextInt();
        int addend = scanner.nextInt();
        int index = scanner.nextInt();
        
        for(int i = 1; i < index; i++)
            number += addend;
        System.out.print(number);
        
        scanner.close();
    }
}
