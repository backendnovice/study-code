package Basic100;

import java.util.Scanner;

public class BasicCommon_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int red = scanner.nextInt();
        int green = scanner.nextInt();
        int blue = scanner.nextInt();
        int count = red * green * blue;
        
        for(int i = 0; i < red; i++)
            for(int j = 0; j < green; j++)
                for(int k = 0; k < blue; k++)
                    System.out.println(i + " " + j + " " + k);
        System.out.print(count);
        
        scanner.close();
    }
}
