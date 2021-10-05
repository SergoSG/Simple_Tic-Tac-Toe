import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int room1 = scanner.nextInt();
        int room2 = scanner.nextInt();
        int room3 = scanner.nextInt();

        System.out.println(room1 / 2 + room1 % 2 + room2 / 2 + room2 % 2 + room3 / 2 + room3 % 2);
    }
}