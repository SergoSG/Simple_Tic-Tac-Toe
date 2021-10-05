import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String format = scanner.next();
        double res = 0;

        switch (format) {
            case "triangle":
                double a = scanner.nextDouble();
                double b = scanner.nextDouble();
                double c = scanner.nextDouble();
                double p = (a + b + c) / 2;
                res = Math.sqrt(p * (p - a) * (p - b) * (p - c));
                System.out.println(res);
                break;
            case "rectangle":
                double a1 = scanner.nextDouble();
                double b1 = scanner.nextDouble();
                res = a1 * b1;
                System.out.println(res);
                break;
            case "circle":
                double r = scanner.nextDouble();
                final double pi = 3.14D;
                res = pi * r * r;
                System.out.println(res);
                break;
            default:
                break;
        }
    }
}