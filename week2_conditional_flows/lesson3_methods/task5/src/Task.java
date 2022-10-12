import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int third = scanner.nextInt();

        int max = max(first, second, third);

        System.out.println("Max number is " + max);
    }

    public static int max(int a, int b, int c) {
        if (a > b) {
            if (a > c) {
                return a;
            }
        } else {
            if (b > c) {
                return b;
            }
        }
        return c;
    }
}