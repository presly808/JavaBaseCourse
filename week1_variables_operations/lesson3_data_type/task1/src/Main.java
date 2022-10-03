public class Main {
   public static void main(String[] args) {
      // Number
      byte b = -127;
      short s = 32676;
      int i = -2_000_000_000;
      // any integer number is seen as int. Hence we add L, in the end, to make it Long
      long l = 1_000_000_000_000L;

      // Floating point
      // by default, any number with . is seen as a double by default
      // hence we need to tell explicitly that this number is float by `f`
      float f = 56.123456f;
      double d = 1.12345678912345;

      boolean b1 = true;
      boolean b2 = false;

      // char
      char c1 = 'A';
      char c2 = 65; // char keeps character which has number underneath
      // so 65 is a code for `A`
      // you can see ASCII table to see more about what I meant

      // Please don't make types scare you
      // In reality, we use int, double, long, and boolean most of the time
      // Although this theory should give a wide vision
   }
}