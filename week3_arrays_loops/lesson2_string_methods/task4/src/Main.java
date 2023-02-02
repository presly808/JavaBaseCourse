public class Main {
   public static void main(String[] args) {
      String input1 = "LOWER";
      String input2  = "upper";

      String lowerCaseInput1 = input1.toLowerCase();
      System.out.println(lowerCaseInput1);
      String upperCaseInput2 = input2.toUpperCase();
      System.out.println(upperCaseInput2);

      boolean startsWithRes1 = input1.startsWith("LO");
      System.out.println(startsWithRes1);
      boolean endsWithRes1 = input1.endsWith("ER");
      System.out.println(endsWithRes1);

      String replaceRes = input2.replace("p", "_");
      System.out.println(replaceRes);
   }
}