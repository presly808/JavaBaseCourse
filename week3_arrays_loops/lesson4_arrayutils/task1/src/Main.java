import java.util.Arrays;

public class Main {
   public static void main(String[] args) {
      // toString
      int[] arr = new int[]{1,2,3,4};
      // you can pass arr of any type, for an instance we pass int[]
      String toStrRes = Arrays.toString(arr);
      System.out.println("toStrRes = " + toStrRes);

      // equals
      int[] arr2 = new int[]{1,2,3,4};
      int[] arr3 = new int[]{2,3,4};
      boolean eqRes1 = Arrays.equals(arr2, arr3);
      System.out.println("eqRes1 = " + eqRes1);
      boolean eqRes2 = Arrays.equals(arr, arr2);
      System.out.println("eqRes1 = " + eqRes2);

      // fill
      double[] arr4 = new double[5];
      System.out.println("arr4 before filling = " + Arrays.toString(arr4));
      Arrays.fill(arr4, 8.88);
      System.out.println("arr4 after filling = " + Arrays.toString(arr4));
      // be accurate with indexes, they can not be negative or exceed the length of array
      String[] names = new String[5];
      System.out.println("names before filling range = " + Arrays.toString(names));
      Arrays.fill(names, 1, 3, "Oleg");
      System.out.println("names after filling range = " + Arrays.toString(names));

      // copyOf
      long[] arrToCopy = new long[]{8,7,6,5,4,3};
      long[] arr4OnlyTwoElements = Arrays.copyOf(arrToCopy, 2);
      System.out.println("arr4OnlyTwoElements = " + Arrays.toString(arr4OnlyTwoElements));
      long[] arr4Copy = Arrays.copyOf(arrToCopy, arrToCopy.length);
      System.out.println("arr4Copy = " + Arrays.toString(arr4Copy));

      // copyOfRange -> similar to substring with proper indices
      long[] copiedArrWithRange = Arrays.copyOfRange(arrToCopy, 1,3);
      System.out.println("copiedArrWithRange = " + Arrays.toString(copiedArrWithRange));

      // sort
      int[] arr5 = new int[]{7,1,9,2,7,-2,10,4};
      Arrays.sort(arr5);
      System.out.println("arr5 after sorting = " + Arrays.toString(arr5));
   }
}