package Basic100;

import java.util.Scanner;

public class BasicArray_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] array = new int[23];
        
        int count = scanner.nextInt();
        
        for(int i = 0; i < count; i++) {
            int index = scanner.nextInt() - 1;
            array[index]++;
        }
        
        for(int number : array) {
            System.out.print(number + " ");
        }
        
        scanner.close();
    }
}
