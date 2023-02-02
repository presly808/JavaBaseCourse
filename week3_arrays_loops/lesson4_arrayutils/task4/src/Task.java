import java.util.Arrays;

public class Task {
  public static boolean equalsAfterSorting(double[] arr1, double [] arr2) {

      if (arr1 == null || arr2 == null) {
          return false;
      }

      double[] copy1 = Arrays.copyOf(arr1, arr1.length);
      double[] copy2 = Arrays.copyOf(arr2, arr1.length);

      Arrays.sort(copy1);
      Arrays.sort(copy2);

      return Arrays.equals(copy1, copy2);
  }
}