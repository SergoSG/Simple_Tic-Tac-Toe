import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber;
        int res = 0;
        int maxSum = 1000;

        while (true) {
            inputNumber = scanner.nextInt();
            if (res < maxSum) {
                res += inputNumber;
            }
            if (inputNumber == 0) {
                break;
            }
        }
        res = res >= maxSum ? res - maxSum : res;
        System.out.println(res);
    }
}
