package Basic100;

import java.util.Scanner;

public class BasicArray_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int count = scanner.nextInt();
        int[][] array = new int[19][19];
        
        for (int i = 0; i < count; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            array[x - 1][y - 1] = 1;
        }
        
        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        
        scanner.close();
    }
}
