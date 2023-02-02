public class Task {

  public static void main(String[] args) {
      System.out.println("Begin");
      int a = 4;
      int b = 4;
      String calculateRes = calculate(a, b);
      System.out.println(calculateRes);
      System.out.println("End");
  }

  public static String calculate(int x, int y) {
      int sum = sum(x, y);
      int mult = multiply(sum, sum);
      return formatStr(mult);
  }

  public static int multiply(int n1, int n2) {
      int res = n1 * n2;
      return res;
  }

  public static int sum(int num1, int num2) {
    return num1 + num2;
  }

  public static String formatStr(int input) {
      return String.format("Your Result is %s", input);
  }

}