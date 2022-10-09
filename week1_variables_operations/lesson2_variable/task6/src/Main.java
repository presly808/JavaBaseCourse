public class Main {
   public static void main(String[] args) {
      double discountPercent = 0.05;
      int productPrice = 760;
      int countOfProducts = 4;

      int totalPrice = productPrice * countOfProducts;
      double totalPriceWithDiscount = (totalPrice) - (totalPrice * discountPercent);

      System.out.println(totalPriceWithDiscount);
   }
}