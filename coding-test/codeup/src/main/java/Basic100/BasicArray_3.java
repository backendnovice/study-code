package Basic100;

import java.util.Scanner;

public class BasicArray_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int count = scanner.nextInt();
        int fastest = 99;
        
        for(int i = 0; i < count; i++) {
            int number = scanner.nextInt();
            if(number < fastest)
                fastest = number;
        }
        
        System.out.print(fastest);
        
        scanner.close();
    }
}
