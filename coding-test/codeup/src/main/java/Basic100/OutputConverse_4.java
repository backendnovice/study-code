package Basic100;

import java.util.Scanner;

public class OutputConverse_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int number = Integer.parseInt(scanner.next(), 8);
        
        System.out.print(String.format("%d", number));
    }
}
