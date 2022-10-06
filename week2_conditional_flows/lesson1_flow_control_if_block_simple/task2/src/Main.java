import java.util.Scanner;

public class Main {
   public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);

      int firstNumber = sc.nextInt();
      int secondNumber = sc.nextInt();

      if (firstNumber < secondNumber) {
         System.out.println("FirstNumber is less");
      }

      if (firstNumber == secondNumber) {
         System.out.println("FirstNumber is equal");
      }

   }
}