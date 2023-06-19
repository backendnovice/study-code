package Basic100;

import java.util.Scanner;

public class DataType_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double number = scanner.nextDouble();
        
        System.out.print(String.format("%.11f", number));
        
        scanner.close();
    }
}
