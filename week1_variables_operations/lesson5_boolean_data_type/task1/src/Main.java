public class Main {
   public static void main(String[] args) {
      // Example0: Give a loan if you are not a scam.
      boolean scam = false;
      boolean giveLoan = !scam;
      System.out.println("giveLoan = " + giveLoan);

      //Example1: Check if you can have a tea.
      boolean hasCattle = true;
      boolean hasElectricity = true;
      // two conditions should be true. As a result, we need to use AND (&&)
      boolean canWeHaveTea = hasCattle && hasElectricity;
      System.out.println("canWeHaveTea = " + canWeHaveTea);

      //Example2: Can I enter a house?
      boolean hasKeys = false;
      boolean somebodyAtHome = true;
      // we need to meet at least one condition. OR (||)
      boolean canEnterHouse = hasKeys || somebodyAtHome;
      System.out.println("canEnterHouse = " + canEnterHouse);

      //Example3: Can you get an offer?
      // ((older than 18 AND worked for GOOGLE) OR (Has a degree in Computer Science AND IQ level is higher than 130))
      int age = 20;
      boolean workedForGoogle = false;
      boolean hasDegree = true;
      int iqLevel = 131;
      boolean receivedOffer = (age > 18 && workedForGoogle) || (hasDegree && iqLevel > 130);
      System.out.println("receivedOffer = " + receivedOffer);
   }
}