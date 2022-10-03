public class Main {
   // TODO refactor task.md, maybe add more examples
   public static void main(String[] args) {
      short s1 = 300;
      System.out.println("short 300 in binary => " + Integer.toBinaryString(s1));
      byte b1 = (byte) s1;
      System.out.println("b1 after casting => " + b1);

      String binary = Integer.toBinaryString(b1);
      System.out.println("byte binary after casting -> " + binary);

      int fromBinary = Integer.parseInt(binary,2);
      System.out.println("decimal byte binary " + fromBinary);
      System.out.println("-------------");

      // more examples of casting
      int code = 56;
      char ch1 = (char) code;
      System.out.println("ch1 = " + ch1);

      long l1 = 1_000_000;
      int i1 = (int) l1;
      System.out.println("i1 = " + i1);
   }
}