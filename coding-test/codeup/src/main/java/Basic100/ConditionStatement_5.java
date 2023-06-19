package Basic100;

import java.util.Scanner;

public class ConditionStatement_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String score = scanner.next();
        
        switch (score) {
            case "A":
                System.out.print("best!!!");
                break;
            case "B":
                System.out.print("good!!");
                break;
            case "C":
                System.out.print("run!");
                break;
            case "D":
                System.out.print("slowly~");
                break;
            default:
                System.out.print("what?");
                break;
        }
        
        scanner.close();
    }
}
