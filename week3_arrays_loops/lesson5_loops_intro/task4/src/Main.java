import java.util.Arrays;

public class Main {
   public static void main(String[] args) {
      int[] array = new int[]{7, 1, 5, -34, 66, 2, 9};

      // Example1 go from head to tail
      int index = 0;
      // exit condition in order not to be stuck in infinite loop
      while (index < array.length) {
         // get value using our index variable
         int value = array[index];

         // do any operation with value
         // we just print it
         System.out.print(value + " ");

         // change index to access the next value in array
         index++;
      }

      System.out.println();
      System.out.println("----------");

      // Example2 we are going to iterate array from tail to head
      int step = array.length - 1;
      String accumulator = "";
      while (step >= 0) {
         accumulator += array[step] + " ";
         step--;
      }
      System.out.println(accumulator);
      System.out.println("----------");

      // Example3
      //    iterate and write values to an array

      int index2 = 0;
      int[] resultArr = new int[10];
      while (index2 < resultArr.length) {
         resultArr[index2] = index2 * 2; // you can write any value here
         index2 += 1;
      }
      System.out.println(Arrays.toString(resultArr));

      System.out.println("-----------");

      // Example4 let's have two pointers (indexes)
      //  go in both direction simultaneously until `star` meets `end` with complicated step

      int start = 0;
      int end = array.length - 1;

      while (start < end) {

         int val1 = array[start];
         int val2 = array[end];

         System.out.printf("%s, %s\n", val1, val2);

         start += 2;
         end -= 2;
      }

      System.out.println("-------");
   }
}