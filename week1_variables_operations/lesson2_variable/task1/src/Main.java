public class Main {
   public static void main(String[] args) {
      // we declare and assign each variable
      String coffeeName = "americano";
      double price = 8.7;
      double deposit = 20;
      int quantity = 2;
      boolean hasSugar = false;

      // there is declaration,
      // reading values from `price` and `quantity`
      // operation over the values that have been read
      // assign to declared variable `fullPrice`
      double fullPrice = price * quantity;
      // rest we should return to the client
      double rest = deposit - fullPrice;

      System.out.print("Your deposit ");
      System.out.print(deposit);
      System.out.println();
      System.out.print("You order = ");
      System.out.print(coffeeName);
      System.out.print(". With Sugar = ");
      System.out.print(hasSugar);
      System.out.print(". Total price = ");
      System.out.println(fullPrice);
      System.out.println("------------");
      System.out.println("Preparing the coffee...");
      System.out.println("------------");
      System.out.println("Your coffee is ready.");

      // Some food for thoughts
      // if you take plus any type to String -> you will get string
      // String + int = String, "Number = " + 2 => "Number 2"...etc
      // String + boolean = String, "With sugar: " + true = "With sugar true"
      // You wish you knew it before
      System.out.print("Don't forget your rest " + rest);

   }
}