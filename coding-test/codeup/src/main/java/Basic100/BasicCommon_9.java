package Basic100;

import java.util.Scanner;

public class BasicCommon_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int width = scanner.nextInt();
        int height = scanner.nextInt();
        int bitrate = scanner.nextInt();
        double volume = (double) (width * height * bitrate) / (8 * 1024 * 1024);
        
        System.out.print(String.format("%.2f MB", volume));
        
        scanner.close();
    }
}
