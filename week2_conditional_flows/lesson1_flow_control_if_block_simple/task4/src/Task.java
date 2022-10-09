import java.util.Scanner;

public class Task {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int speed = sc.nextInt();

    if (speed >= 0 && speed <= 50) {
      System.out.println("Best speed for driving in a city");
    } else if (speed >= 0 && speed < 60) {
      System.out.println("You are very close to getting a ticket");
    } else if (speed >= 60) {
      System.out.println("You are dangerous!");
    } else {
      System.out.println("Speed is incorrect");
    }
  }
}