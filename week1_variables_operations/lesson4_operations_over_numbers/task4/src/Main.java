public class Main {
   public static void main(String[] args) {
      // Find who is younger.
      int manAge = 40;
      int womanAge = 35;
      boolean isManOlder = manAge > womanAge;
      System.out.println("isManOlder = " + isManOlder);

      // Can a client afford macBook?
      double clientMoney = 1200;
      int macBookPrice = 1400;
      System.out.println("Can client afford mac book? " + (clientMoney >= macBookPrice));

      // Can I have tea?
      boolean hasElectricity = true;
      boolean hasCattle = true;
      // strange logic, but we don't know boolean operations yet
      boolean canHaveTea = hasElectricity == hasCattle;

      System.out.println("canHaveTea = " + canHaveTea);

      // Is it not noon on the clock?
      int currentTime = 11;
      int noonTime = 12;
      boolean isNotNoon = currentTime != noonTime;
      System.out.println("isNotNoon = " + isNotNoon);
   }
}