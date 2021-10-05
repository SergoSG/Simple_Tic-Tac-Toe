import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int res = 0;
        for (int i = 0; i < count; i++) {
            int number = scanner.nextInt();
            if (number % 6 == 0) {
                res += number;
            }
        }
        System.out.println(res);
    }
}