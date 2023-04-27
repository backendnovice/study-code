package level0;

import java.util.Arrays;
import java.util.Scanner;

public class PrintStringRotate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
    
        Arrays.stream(a.split("")).forEach(System.out::println);
        
        scanner.close();
    }
}
