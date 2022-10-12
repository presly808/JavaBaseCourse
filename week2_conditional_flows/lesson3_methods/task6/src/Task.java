import java.util.Scanner;

public class Task {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int height = sc.nextInt();
        boolean isMale = sc.nextBoolean();

        // validation
        if (height < 0) {
            System.out.println("Height can no be negative");
            return;
        }

        double perfectWeightInKg = 0;
        int perfectWeightInPounds = 0;

        // TODO extract similar lines to method and call it
        if (isMale) {
            perfectWeightInKg = ((height - 100) * 1.15);
            perfectWeightInPounds = (int) (perfectWeightInKg * 2.20462262185);
        } else {
            perfectWeightInKg = ((height - 110) * 1.15);
            perfectWeightInPounds = (int) (perfectWeightInKg * 2.20462262185);
        }

        System.out.print("Your perfect weight in pounds is " + perfectWeightInPounds);
    }

    // declare method that may help simplify and shorten the code
    public static int calculatePerfectWeightInPounds(int heightInCm, int index) {
        return (int)(((heightInCm - index) * 1.15) * 2.20462262185);
    }
}