package Basic100;

import java.util.Scanner;

public class BasicArray_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[][] board = new int[10][10];
        
        for(int i = 0; i < 10; i++) {
            for(int j = 0; j < 10; j++) {
                board[i][j] = scanner.nextInt();
            }
        }
        
        int temp = 1;
        for(int height = 1; height < 10; height++) {
            for(int width = temp; width < 10; width++) {
                if(board[height][width] == 1 || board[height][width] == 2) {
                    temp = (board[height][width] == 1) ? width - 1 : width;
                    break;
                }else {
                    board[height][width] = 9;
                    temp = width;
                }
            }
            if(board[height][temp] == 2) {
                board[height][temp] = 9;
                break;
            }
        }
        
        for(int i = 0; i < 10; i++) {
            for(int j = 0; j < 10; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        
        scanner.close();
    }
}
