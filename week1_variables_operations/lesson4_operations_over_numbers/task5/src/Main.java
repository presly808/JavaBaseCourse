import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      // Task1 Check if we can put a picture on a wall.
      // we need to compare the height and width of the wall and painting. Picture length and width should be less.

      int wallHeight = scanner.nextInt();
      int wallWidth = scanner.nextInt();

      int pictureHeight = scanner.nextInt();
      int pictureWidth = scanner.nextInt();

      boolean canWePutPictureOnWall = (wallWidth > pictureWidth) == (wallHeight > pictureHeight);
      System.out.printf("canWePutPictureOnWall = %s\n", canWePutPictureOnWall);

      // Task2 Check if number is even
      int number = scanner.nextInt();
      boolean isNumberEven = (number % 2) == 0;
      System.out.printf("isNumberEven = %s", isNumberEven);
   }
}