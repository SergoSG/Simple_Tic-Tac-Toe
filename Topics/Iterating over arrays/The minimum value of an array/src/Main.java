import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();
        int[] numbers = new int[count];
        int minValue = 0;
        for (int i = 0; i < count; i++) {
            numbers[i] = scanner.nextInt();
            minValue = minValue > numbers[i] || i == 0 ? numbers[i] : minValue;
        }
        System.out.println(minValue);
    }
}