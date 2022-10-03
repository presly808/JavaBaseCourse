public class Main {
   public static void main(String[] args) {
      int age = 30;
      boolean male = true;
      double height = 1.8;
      String name = "Serhii";

      // One more method for you `printf`...just look at it closely. It should like it once comprehend
      // you will see String with `%s` inside. Eventually, all '%s' will be replaced with the variable's values we pass after
      System.out.printf("Name %s, Age %s, Male %s, height %s M", name, age, male, height);
   }
}