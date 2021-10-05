import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int roomCount = 8;
        String[] inString = new String[roomCount];
        for (int i = 0; i < roomCount; i++) {
            inString[i] = scanner.next();
        }
        for (int i = roomCount; i > 0 ; i--) {
            System.out.println(inString[i - 1]);
        }
    }
}