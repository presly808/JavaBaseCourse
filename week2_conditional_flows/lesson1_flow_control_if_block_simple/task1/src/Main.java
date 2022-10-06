public class Main {
   public static void main(String[] args) {
      // **************
      System.out.println("Market Start");

      int age = 18;
      int time = 10;

      // as age < 21 -> true , we run the code inside block
      if (age < 21) {
         System.out.println("You are not allowed to buy alcohol");
      }

      // this block will not be run as time >= 22 returns false
      if (time >= 22) {
         System.out.println("We don't sell alcohol after 10 p.m");
      }

      System.out.println("Market End");
      System.out.println();

      // **************
      System.out.println("Door Start");
      boolean hasKeys = true;
      boolean isDoorOpen = false;
      if (hasKeys && isDoorOpen) {
         isDoorOpen = true;
         System.out.println("Doors are open: " + isDoorOpen);
      }
      System.out.println("Door End");
      System.out.println();

      // **************
      System.out.println("Market V2 Start");
      if (age < 21 || time > 22) {
         System.out.println("Market v2 rejected your request on alcohol");
      }
      System.out.println("Market V2 End");
   }
}