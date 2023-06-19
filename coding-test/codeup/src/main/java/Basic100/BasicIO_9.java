package Basic100;

import java.util.Arrays;
import java.util.Scanner;

public class BasicIO_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String date = scanner.next();
        
        int[] dates = Arrays
                .stream(date.split("[.]"))
                .mapToInt(Integer::parseInt)
                .toArray();
        
        System.out.print(String.format("%04d.%02d.%02d", dates[0], dates[1], dates[2]));
        
        scanner.close();
    }
}
