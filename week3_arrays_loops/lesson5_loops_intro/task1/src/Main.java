public class Main {
   // Run with debug to see how it works step by step
   public static void main(String[] args) {
      int i = 0;
      System.out.println("Going up");
      while (i < 5) {
         System.out.println(i);
         i++; // i = i + 1; or i += 1;
      }

      System.out.println("Going down");
      while (i > 0) {
         System.out.println(i);
         i--; // i = i - 1; or i -= 1;
      }

   }
}