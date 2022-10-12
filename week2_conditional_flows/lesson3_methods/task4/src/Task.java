import java.util.Scanner;

public class Task {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int num1 = scanner.nextInt();
    int num2 = scanner.nextInt();

    int result = multiply(num1, num2);

    System.out.printf("%s * %s = %s", num1, num2, result);
  }

  // Declared method
  public static int multiply(int a, int b) {
    int res = a * b;
    return res;
  }

}