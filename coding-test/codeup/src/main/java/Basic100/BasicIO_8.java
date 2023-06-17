package Basic100;

import java.util.Scanner;

public class BasicIO_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String input = scanner.next();
        String[] times = input.split(":");
        
        System.out.print(times[0] + ":" + times[1]);
        
        scanner.close();
    }
}
