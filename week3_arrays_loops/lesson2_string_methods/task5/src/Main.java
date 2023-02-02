public class Main {
   public static void main(String[] args) {
      String input = null;
      String[] arr = null;
      int[] arr1 = null;

      // default value in array is null
      String[] arr2 = new String[1];
      System.out.println(arr2[0]);

      // check if variable is not null
      if (arr2 != null) {
         System.out.println("arr2 is not null");
      }

      // check if variable is null
      if (arr2[0] == null) {
         System.out.println("Default value in array (arr2[0]) is null");
      }

      // not workable
      // int a = null;
   }
}