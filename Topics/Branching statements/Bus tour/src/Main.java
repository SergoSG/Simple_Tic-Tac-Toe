import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int busHeight = scanner.nextInt();
        int bridgeCount = scanner.nextInt();
        int bridgeHeight;
        boolean isCrashed = false;
        for (int i = 1; i <= bridgeCount; i++) {
            bridgeHeight = scanner.nextInt();
            if (busHeight >= bridgeHeight) {
                System.out.println("Will crash on bridge " + i);
                isCrashed = true;
                break;
            }
        }
        if (!isCrashed) {
            System.out.println("Will not crash");
        }
    }
}