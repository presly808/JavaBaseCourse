public class Task {
    public static void main(String[] args) {
        // charAt get char by index
        String s1 = "Line1";
        char char1 = s1.charAt(0);
        System.out.println("s1.charAt(0) = " + char1);

        // toCharArray
        char[] charArr = s1.toCharArray();
        System.out.println("charArr[0] = " + charArr[0]);

        // length
        int s1Length = s1.length();
        System.out.println("s1.length() = " + s1Length);

        // equals
        String s2 = "line2";
        boolean equalsRes1 = s1.equals(s2);
        System.out.println("s1.equals(s2) = " + equalsRes1);
        boolean equalsRes2 = s1.equals("line1");
        System.out.println("s1.equals(\"line1\") = " + equalsRes2);

        // contains
        boolean containsRes1 = s1.contains("li");
        System.out.println("s1.contains(\"li\") = " + containsRes1); // true
        boolean containsRes2 = s1.contains("xa");
        System.out.println("s1.contains(\"xa\") = " + containsRes2); // false

        // from char[] to String
        char[] charArr2 = {'x', 'y', 'c'};
        String fromCharArr = new String(charArr2);
        System.out.println("new String(charArr2) = " + fromCharArr); // "xyc"

        // startsWith
        boolean startsWithRes1 = s1.startsWith("li");
        System.out.println("s1.startsWith(\"li\") = " + startsWithRes1);
        boolean startsWithRes2 = s1.startsWith("i");
        System.out.println("s1.startsWith(\"i\") = " + startsWithRes2);

        // endsWith
        boolean endsWithRes1 = s1.endsWith("e1");
        System.out.println("s1.endsWith(\"e1\") = " + endsWithRes1);
        boolean endsWithRes2 = s1.endsWith("x");
        System.out.println("s1.endsWith(\"x\") = " + endsWithRes2);

        // trim
        String s3 = "      wordEmptinessAround     ";
        String s3Trimmed = s3.trim();
        System.out.println("s3.trim() = " + s3Trimmed);

        // indexOf
        String s4 = "before{sequence}after";
        int indexOfRes = s4.indexOf("{");
        System.out.println("s4.indexOf(\"{\") = " + indexOfRes);
        // method returns -1 if symbol not found
        int indexOfResNotFound = s4.indexOf("|");
        System.out.println("s4.indexOf(\"|\") = " + indexOfResNotFound);

        // lastIndexOf
        int lastIndexOfRes = s4.lastIndexOf("}");
        System.out.println("s4.lastIndexOf(\"}\") = " + lastIndexOfRes);
        // method returns -1 if symbol not found
        int lastIndexOfResNotFound = s4.lastIndexOf("PPPP");
        System.out.println("s4.lastIndexOf(\"PPPP\") = " + lastIndexOfResNotFound);

        // substring
        String s5 = "xxYYYxx";
        String substring1 = s5.substring(2, 5);
        System.out.println("s5.substring(2, 5) = " + substring1);
        // play with substring using different indices, try to use negative index or index that out of size of string

        // trim
        String s6 = "Ostap,Oleg,Vira";
        String[] names = s6.split(",");
        System.out.println("names[0] = " + names[0]);

        // concat
        String s7 = ",Lubov";
        String concatRes = s6 + s7;
        System.out.println("s6 + s7 = " + concatRes);

        // replace
        String s8 = "xxYYxxYY";
        String replaceRes = s8.replace("x", "9");
        System.out.println("s8.replace(\"x\", \"9\") = " + replaceRes);

        // toUpperCase
        String s9 = "abcd";
        System.out.println("s9.toUpperCase() = " + s9.toUpperCase());

        // toLowerCase
        String s10 = "ABC";
        System.out.println("s10.toUpperCase() = " + s10.toLowerCase());

    }
}