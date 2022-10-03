public class Main {
   // recharge the phone number
   public static void main(String[] args) {
      String phoneNumber = "+380971231212";
      boolean valid = true;
      int amount = 20;

      // Create String variable using `+` operation called `concatenation`
      String message = "Going to recharge number " + phoneNumber + ". Validated: " + valid + ". With amount: " + amount;
      System.out.println(message);
   }
}