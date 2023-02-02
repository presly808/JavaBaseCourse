import java.util.Arrays;

public class Task {
  public static String createStrArray(int size, int filler) {
    if (size < 0 || (filler < 0 || filler > 9)) {
      return null;
    }

    int[] arr = new int[size];
    Arrays.fill(arr, filler);
    return Arrays.toString(arr);
  }
}