import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inStr = scanner.next();
        inStr = inStr.replace('a', 'b');
        System.out.println(inStr);
    }
}