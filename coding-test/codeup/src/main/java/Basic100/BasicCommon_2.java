package Basic100;

import java.util.Scanner;

public class BasicCommon_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while(true) {
            String string = scanner.next();
            System.out.println(string);
            if(string.equals("q"))
                break;
        }
        
        scanner.close();
    }
}
