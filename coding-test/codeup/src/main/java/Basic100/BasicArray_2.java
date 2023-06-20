package Basic100;

import java.util.Scanner;

public class BasicArray_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int count = scanner.nextInt();
        int[] array = new int[count];
        
        for(int i = 0; i < count; i++)
            array[i] = scanner.nextInt();
        
        for(int i = count - 1; i >= 0; i--)
            System.out.print(array[i] + " ");
        
        scanner.close();
    }
}
