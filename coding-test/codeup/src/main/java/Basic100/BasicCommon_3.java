package Basic100;

import java.util.Scanner;

public class BasicCommon_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int limit = scanner.nextInt();
        int answer = 0, total = 0;
        for(int i = 1; total < limit; i++) {
            total += i;
            answer = i;
        }
        
        System.out.print(answer);
        
        scanner.close();
    }
}
