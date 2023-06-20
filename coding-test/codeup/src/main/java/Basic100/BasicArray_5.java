package Basic100;

import java.util.Scanner;

public class BasicArray_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[][] array = new int[19][19];
        
        for(int i = 0; i < 19; i++) {
            for(int j = 0; j < 19; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
        
        int count = scanner.nextInt();
        
        for(int i = 0; i < count; i++) {
            int x = scanner.nextInt() - 1;
            int y = scanner.nextInt() - 1;
            
            for(int j = 0; j < 19; j++) {
                array[j][y] = (array[j][y] == 1) ? 0 : 1;
            }
            
            for(int j = 0; j < 19; j++) {
                array[x][j] = (array[x][j] == 1) ? 0 : 1;
            }
        }
        
        for(int i = 0; i < 19; i++) {
            for(int j = 0; j < 19; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        
        scanner.close();
    }
}
