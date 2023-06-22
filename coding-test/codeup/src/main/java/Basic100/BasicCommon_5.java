package Basic100;

import java.util.Scanner;

public class BasicCommon_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int number = Integer.parseInt(scanner.next(), 16);
        
        for(int i = 1; i <= 15; i++) {
            String hexed = Integer.toHexString(number).toUpperCase();
            String multi = Integer.toHexString(i).toUpperCase();
            String result = Integer.toHexString(number * i).toUpperCase();
            System.out.println(hexed + "*" + multi + "=" + result);
        }
        
        scanner.close();
    }
}
