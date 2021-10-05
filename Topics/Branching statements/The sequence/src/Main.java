import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = scanner.nextInt();
        int cnt = 0;
        int num = 1;

        while (cnt < max) {
            for (int i = 1; i <= num && cnt < max; i++) {
                System.out.print(num + " ");
                cnt++;
            }
            num++;
        }
    }
}