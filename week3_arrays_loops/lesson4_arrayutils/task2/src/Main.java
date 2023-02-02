import java.util.Arrays;

public class Main {
    // TODO add placeholders
    public static void main(String[] args) {
        int[] input1 = new int[8];
        int[] input2 = new int[]{9, -2, 10, 4, 3, 2, 99};
        System.out.println("input1 = " + Arrays.toString(input1));

        Arrays.fill(input1, 0, 3, 11);
        System.out.println("input1 after filling = " + Arrays.toString(input1));

        int[] copied = Arrays.copyOfRange(input1, 0, 3);
        System.out.println("copied = " + Arrays.toString(copied));

        System.out.println("input2 = " + Arrays.toString(input2));
        Arrays.sort(input2);
        System.out.println("input2 after sorting = " + Arrays.toString(input2));

        boolean eqRes = Arrays.equals(input2, new int[]{-2, 2, 3, 4, 9, 10, 99});
        System.out.println("eqRes = " + eqRes);
    }
}