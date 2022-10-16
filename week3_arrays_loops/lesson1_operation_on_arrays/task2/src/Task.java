public class Task {

  public static int getFirstIndex() {
    return 0;
  }

  public static int[] createIntArray(int size){
    return new int[size];
  }

  public static String[] createArray(String element1, String element2) {
    return new String[]{element1, element2};
  }

  public static int getLastIndexOfArray(int[] array){
    return array.length - 1;
  }

  public static int getArraySize(char[] symbols) {
    return symbols.length;
  }
}