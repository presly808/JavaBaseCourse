import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int heartBeatsPerMinute = sc.nextInt();

        if (heartBeatsPerMinute >= 60 && heartBeatsPerMinute <= 100) {
            System.out.println("Your heart rate is in normal zone");
        } else if (heartBeatsPerMinute < 60 && heartBeatsPerMinute > 30) {
            System.out.println("Are you sleeping? You heart rate is low");
        } else if (heartBeatsPerMinute > 100) {
            System.out.println("Be accurate while doing exercises");
        } else {
            System.out.println("Invalid input data");
        }

        System.out.printf("heartBeatsPerMinute = %s", heartBeatsPerMinute);
    }
}