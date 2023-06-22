package Basic100;

import java.util.Scanner;

public class BasicCommon_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double hertz = scanner.nextInt();
        int bitrate = scanner.nextInt();
        int channel = scanner.nextInt();
        int times = scanner.nextInt();
        
        double volume = hertz * bitrate * channel * times / (8 * 1024 * 1024);
        System.out.print(String.format("%.1f", volume) + " MB");
        
        scanner.close();
    }
}
