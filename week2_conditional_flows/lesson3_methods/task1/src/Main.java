public class Main {
   public static void main(String[] args) {
      int priceInUsd = 100;
      double eurInOneUSD = 1.03;
      double discountHigh = 0.25;
      double discountMedium = 0.15;
      double discountNormal = 0.1;
      boolean isPremiumAccount = true;

      double finalPriceInEur = 0;

      if (priceInUsd > 100) {
         finalPriceInEur = calculatePriceWithDiscountAndCurrency(priceInUsd, discountHigh, eurInOneUSD);
      } else if (priceInUsd > 50) {
         finalPriceInEur = calculatePriceWithDiscountAndCurrency(priceInUsd, discountMedium, eurInOneUSD);
      } else {
         finalPriceInEur = calculatePriceWithDiscountAndCurrency(priceInUsd, discountNormal, eurInOneUSD);
      }

      System.out.println("You final price is " + finalPriceInEur);
   }

   // declaration (creating) of the method
   // this method accepts three arguments (initialPrice, discount, currencyRate)
   //  and return totalPrice
   public static double calculatePriceWithDiscountAndCurrency(int initialPrice, double discount, double currencyRate) {
      double finalPriceWithoutDiscount = initialPrice - (initialPrice * discount);
      double finalPriceDiscountCurrency = finalPriceWithoutDiscount * currencyRate;
      return finalPriceDiscountCurrency;
   }
}