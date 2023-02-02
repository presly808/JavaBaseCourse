public class Task {
  public static void parseAndProcess(String inputString) {

    String trimmedStr = inputString.trim();
    String[] parts = trimmedStr.split(",");

    if (parts.length != 3) {
      // validation error because we found more than expected
      return;
    }

    String[] names = new String[3];
    int[] scores = new int[3];
    String[] cities = new String[3];

    String part1 = parts[0];
    String withoutBrackets = part1.substring(1, part1.length() - 1);
    String[] studentParts1 = withoutBrackets.split(";");

    String name = studentParts1[0];
    int score = Integer.parseInt(studentParts1[1]);
    String city = studentParts1[2];

    names[0] = name;
    scores[0] = score;
    cities[0] = city;
    // max



  }
}