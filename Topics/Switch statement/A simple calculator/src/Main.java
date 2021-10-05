import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long num1 = scanner.nextLong();
        char operation = scanner.next().charAt(0);
        long num2 = scanner.nextLong();
        long res = 0;

        switch (operation) {
            case '+':
                res = num1 + num2;
                System.out.println(res);
                break;
            case '-':
                res = num1 - num2;
                System.out.println(res);
                break;
            case '*':
                res = num1 * num2;
                System.out.println(res);
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Division by 0!");
                    break;
                } else {
                    res = num1 / num2;
                    System.out.println(res);
                    break;
                }
            default:
                System.out.println("Unknown operator");
        }
    }
}