import java.util.Arrays;
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      // input is a string with 5 symbols
      String input = scanner.next();

      char firstChar = input.charAt(0);
      char lastChar = input.charAt(input.length() - 1);
      System.out.printf("firstChar %s, lastChar %s\n", firstChar, lastChar);

      char[] charArr = input.toCharArray();
      System.out.println("charArrayWithoutLastChar = " + Arrays.toString(charArr));

      char[] newCharArr = {'x', 'y', 'z'};

      String fromCharArray = new String(newCharArr);
      System.out.println("new string = " + fromCharArray);
   }
}