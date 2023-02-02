I hope you get how convenient is to use String methods. 

There is `Arrays` class with many useful methods for arrays.

Methods:
* Arrays.toString()
  * `public static String toString(<type>[] a)`
  * Returns string representation of an input array
* Arrays.equals();
  * `public static boolean equals(<type>[] a, <type>[] a2)`
  * Returns `true` if two input arrays are equal, otherwise `false`
* Arrays.copyOf();
  * `public static <type>[] copyOf(<type>[] original, int newLength)`
  * copy an array by defining a new length
* Arrays.copyOfRange();
  * `public static <type>[] copyOfRange(<type>[] original, int from, int to)`
  * copy a defined range of an array
* Arrays.fill();
  * `public static void fill(<type>[] a, <type> val)`
  * fill an array with a particular value
* Arrays.sort();
  * `public static void sort(<type>[] a)`
  * sort an array in ascending order
    * there are many ways of sorting. We will look closer later

Please note that some methods modify array that you pass inside as an argument, such as: `sort, fill`

More examples in the code