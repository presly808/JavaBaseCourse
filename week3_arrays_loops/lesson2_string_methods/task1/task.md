We came to a new topic where we learn more about String methods. Believe me this will be relevant always.

`String` is not primitive type.`String` is a `char[]`, however with many useful operations.

if we have `char[]` we can do operations that are relevant to arrays:
* create `char[] arr = new char[5]`
* read by index `char c1 = arr[0]`
* write by index `arr[0] = 'x'`
* get length of array `arr.length`

But `String` has much more methods inside. I hope you agree that this is more powerful that just `char[]`

We are going to review the most important of them:
* contains 
  * Checks whether a string contains a sequence of characters
  * `public boolean contains(CharSequence s)`
* equals
  * Compares two strings. Returns true if the strings are equal, and false if not
  * `public boolean equals(Object anObject)`
  * In this case you should pass value of type `String`. Don't confuse yourself with `Object` type for now
* indexOf
  * Returns the position of the first found occurrence of specified characters in a string
  * `public int indexOf(String str)`
* lastIndexOf
  * Returns the position of the last found occurrence of specified characters in a string
  * `public int lastIndexOf(String str)`
* charAt
  * Returns the character at the specified index (position)
  * `public char charAt(int index)`
* toCharArray
  * Converts this string to a new character array
  * `public char[] toCharArray()`
* startsWith
  * Checks whether a string starts with specified characters
  * `public boolean startsWith(String prefix)`
* endsWith
  * Checks whether a string ends with the specified character(s)
  * `public boolean endsWith(String suffix)`
* substring
  * Returns a new string which is the substring of a specified string
  * `public String substring(int beginIndex, int endIndex)`
* trim 
  * Removes whitespace from both ends of a string
  * `public String trim()`
* split
  * Splits a string into an array of substrings
  * `public String[] split(String regex)`
* replace
  * Searches a string for a specified value, and returns a new string where the specified values are replaced
  * `public String replace(CharSequence target, CharSequence replacement)`
* concat
  * Appends a string to the end of another string
  * `public String concat(String str)`
  * As this operation is frequently used. In java, we can use `+` sign.
    * Hence `"line1 " + "line2"` is the same as `"line1 ".concat("line2")`. However `+` sign is more readable and compact
* toUpperCase
  * Converts a string to upper case letters
* toLowerCase
  * Converts a string to lower case letters

We will dive into details in the next tasks. Just run the code and see the examples to gain your intuition.