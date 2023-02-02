public class Task {

    public static int[] reverse(int[] input) {
        int index = input.length - 1;
        int[] newArr = new int[input.length];
        while (index >= 0) {
            newArr[newArr.length - index - 1] = input[index];
        }
        return newArr;
    }

    public static boolean eq(int[] arr1, int[] arr2) {

        if (arr1 == arr2) {
            return true;
        }

        if (arr1.length != arr2.length) {
            return false;
        }

        int index = 0;
        while (index < arr1.length) {
            if (arr1[index] != arr2[index]) {
                return false;
            }
            index++;
        }

        return true;
    }

    public static String toStr(int[] input) {

        if (input == null) {
            return "null";
        }

        if (input.length < 1) {
            return "[]";
        }

        String result = "[";
        int index = 0;
        int lastIndex = input.length - 1;
        while (index < lastIndex) {
            result += input[index] + ", ";
            index++;
        }
        result += input[lastIndex] + "]";
        return result;
    }

    // we should show visualization and give descriptive information
    public static int[] copyOfRange(int[] input, int start, int end) {

        if (start < 0 || end < 0) {
            return null;
        }

        if (input == null || input.length == 0 || start > end) {
            return null;
        }

        int[] copy = new int[end - start];
        int index = 0;
        while (start < end) {
            copy[index] = input[start];
            start++;
            index++;
        }
        return copy;
    }
}