import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int cups = scanner.nextInt();
        boolean isHoliday = scanner.nextBoolean();

        boolean res1 = !isHoliday && cups >= 10 && cups <= 20;
        boolean res2 = isHoliday && cups >= 15 && cups <= 25;
        System.out.println(res1 || res2);
    }
}
