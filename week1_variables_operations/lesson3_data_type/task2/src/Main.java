public class Main {
   public static void main(String[] args) {

      byte b = -127;
      short s = 32676;
      int i = s;
      long l = 123_123_123_123L;

      float f = 90f;
      double d = f;

      boolean bool = true;

      char symbol = '@';
      char symbolByCode = 48;

      System.out.printf("b=%s, s=%s, i=%s, l=%s, f=%s, d=%s, bool=%s, symbol=%s, symbolByCode=%s", b, s, i, l, f, d, bool, symbol, symbolByCode);
   }
}