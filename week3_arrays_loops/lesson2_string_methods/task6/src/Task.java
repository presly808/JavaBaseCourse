public class Task {
    public static String removeBrackets(String input) {

        if (input == null || input.isEmpty()) {
            return input;
        }

        int first = input.indexOf("{");
        int last = input.lastIndexOf("}");

        if (first == -1 || last == -1) {
            return input;
        }

        return input.substring(first + 1, last);
    }
}