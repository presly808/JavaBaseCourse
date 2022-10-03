public class Main {
   public static void main(String[] args) {
      double rest = 88.99;
      int restWithoutCoins = (int) rest;

      char sexMale = 'M';
      int sexCodeInAscii = sexMale;

      int population = 500_000;
      long l1 =  population;

      long populationOfEarth = 7_977_512_000L;
      int populationOfEarthInInt = (int) populationOfEarth;

      boolean populationOfEarthInIntIsCorrect = false;

      // Here is a way how to format strings without printing to console
      String formattedString = String.format("population in long %s, population in int %s, are the values equal %s",
              populationOfEarth, populationOfEarthInInt, populationOfEarthInIntIsCorrect);

      // Either way, we decided to print it)))
      System.out.print(formattedString);
   }
}