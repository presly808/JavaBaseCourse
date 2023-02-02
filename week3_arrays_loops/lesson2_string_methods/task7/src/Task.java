public class Task {
  public static String[] toStrArr(String input) {

      if (input == null || input.isEmpty()) {
          return new String[0];
      }

      return input.trim().split(",");
  }
}