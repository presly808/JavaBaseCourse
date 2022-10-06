import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int heartBeatsPerMinute = sc.nextInt();

        if (heartBeatsPerMinute >= 60 && heartBeatsPerMinute <= 100) {
            System.out.println("Your heart rate is in normal zone");
        } else {
            System.out.println("Heart rate is not normal");
        }

        System.out.printf("heartBeatsPerMinute = %s", heartBeatsPerMinute);
    }
}