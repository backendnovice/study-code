package Basic100;

import java.util.Scanner;

public class BasicIO_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] strings = scanner.next().split("");
        
        for(String string : strings)
            System.out.println("\'" + string + "\'");
        
        scanner.close();
    }
}
