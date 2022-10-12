// In this class we only declare methods, without invocation (call)
public class Task {

    public static void printSomething(){
        System.out.println("Message");
    }

    public static boolean isNumberEven(int number) {
        return number % 2 == 0;
    }

    public static double divide(double num1, double num2) {
        return num1 / num2;
    }

    public static void printName(String name) {
        System.out.println(name);
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static String getName() {
        return "Ivan";
    }
}