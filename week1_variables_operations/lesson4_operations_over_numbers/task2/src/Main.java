public class Main {
   public static void main(String[] args) {
      // Task1 - Calculate Avg
      int a1 = 65;
      int b1 = 43;
      int c1 = 88;

      // In Java you also use "()"  to set precedents for operations. Just like in school years
      int avrOfABC = (a1 + b1 + c1) / 3;

      System.out.println("Avg = " + avrOfABC);

      // Task2 - calculate price for apartment renovation
      int livingRoomWidth = 7;
      int livingRoomLength = 12;
      double pricePerSqMeterLiving = 450.5;

      int bathRoomWidth = 7;
      int bathRoomLength = 12;
      double pricePerSqMeterBathroom = 600.2;

      double totalPriceWithoutDiscount = ((livingRoomLength * livingRoomWidth) * pricePerSqMeterLiving)
              + ((bathRoomWidth * bathRoomLength) * pricePerSqMeterBathroom);

      // Let's assume we get a discount 5%
      int priceAfterDiscount = (int) (totalPriceWithoutDiscount - totalPriceWithoutDiscount * 0.05);

      // Price should be int, lets omit floating point numbers
      System.out.println(priceAfterDiscount);

      // Task3 - Get the last digit of the number
      int number = 1234;
      int lastDigitOfNumber = number % 10;

      // \n is a special symbol that moves cursor to a new line
      System.out.printf("lastDigitOfNumber = %s\n", lastDigitOfNumber);

      System.out.println("End of task");
   }
}