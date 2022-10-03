public class Main {
    public static void main(String[] args) {
        int a = 8;
        double d = 10.0;
        double res1 = a * d;

        double res2 = d + 78f;

        byte b = 2;
        int res3 = b * 78;

        char c1 = 'A';
        char c2 = '0';

        int sumOfCodes1 = c1 + c2;
        int sumOfCodes2 = c1 + 10;

        // here is a way how we can convert from int to char
        // int is bigger by size than char
        // if we move from a more significant to a smaller type, we should cut by cast operation `(<type>)`.
        // We will see more examples later
        char charAfterCodeSum = (char) sumOfCodes1;
        char charAfterCodeSum2 = (char) sumOfCodes2;
        System.out.println(charAfterCodeSum + " " + charAfterCodeSum2);
    }
}