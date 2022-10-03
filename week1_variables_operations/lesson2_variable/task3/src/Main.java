public class Main {
   public static void main(String[] args) {
      // GIVEN
      // User Data
      String paperSize = "A4";
      int count = 10;
      boolean sentByEmail = true;
      // PrintCenter Data
      double pagePrice = 0.5;

      // WHEN
      double totalPrice = pagePrice * count;

      String receipt = "Thanks for coming. Total amount is " + totalPrice + " for " + count + " pages of size "
              + paperSize + ". Price per page is "
              + pagePrice + ". Received from email: " + sentByEmail;

      System.out.print(receipt);
   }
}