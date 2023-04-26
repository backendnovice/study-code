package level0;

import java.util.Scanner;

public class HorJjagCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        
        if(number % 2 == 0) {
            System.out.println(number + " is even");
        }else {
            System.out.println(number + " is odd");
        }
        
        scanner.close();
    }
}
