package Basic100;

import java.util.Scanner;

public class ConditionStatement_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int score = scanner.nextInt();
        
        switch (score / 10) {
            case 10:
            case 9:
                System.out.print("A");
                break;
            case 8:
            case 7:
                System.out.print("B");
                break;
            case 6:
            case 5:
            case 4:
                System.out.print("C");
                break;
            default:
                System.out.print("D");
                break;
        }
        
        scanner.close();
    }
}
