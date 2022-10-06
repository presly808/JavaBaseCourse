public class Main {
   public static void main(String[] args) {
      // change our and run the program in order to see the results depending on hour
      int hour = 12;
      if (hour > 8 && hour < 18) {
         System.out.println("I am working");
      } else {
         // we get into this block if `hour > 8 && hour < 18` == false.
         // Hour should not be in range from 8 till 18
         System.out.println("I am having a rest");
      }

      int age = 18;
      int time = 10;

      // This example should have more sense with if-else logic
      if (age < 21) {
         System.out.println("You are not allowed to buy alcohol");
      } else if (time >= 22) {
         System.out.println("We don't sell alcohol after 10 p.m");
      } else {
         System.out.println("Please take your drink.");
      }
   }
}