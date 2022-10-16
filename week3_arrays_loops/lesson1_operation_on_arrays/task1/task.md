Welcome to the third week of our journey :) The topic is `array`.

As you know, before we start learning, we should comprehend what problems `array` solves.

Let's review a couple of problems:

Problem 1 (Class of students):
```java
public class Main {
    public static void main(String[] args) {
        String name1 = "Oleksandr";
        String name2 = "Oleksandra";
        String name3 = "Valeria";
        String name4 = "Evgen";
        String name5 = "Oleg";
        String name6 = "Nadia";
        String name7 = "Ivanka";
        
        int age1 = 25;
        int age2 = 30;
        int age3 = 14;
        int age4 = 28;
        int age5 = 40;
        int age6 = 50;
        int age7 = 18;
        // Luckily, we have only seven students, what if we have 20 or more
        
        // Arrays help us to store elements in more elegant way, at least with less code 
        String[] names = new String[]{"Oleksandr", "Oleksandra", "Valeria", "Evgen", "Oleg", "Nadia", "Ivanka"};
        int[] ages = new int[]{25, 30, 14, 28, 40, 50, 18};

        //Size of the array is 
        System.out.println("Size of the class is " + names.length);
        System.out.println("Each student(element) that is located in array has an number(index)");
        // Get the first element from the array
        int firstIndex = 0;
        System.out.println("First. Name = " + names[firstIndex] + " age = " + ages[firstIndex]);
        
        // if class size 7, but indexes start from 0. As a result, last element index is Size - 1
        int lastIndex = names.length - 1;
        
        // As you see, we use variable name and number (index) to access to an element of an array
        System.out.println("Last. Name = " + names[lastIndex] + " age = " + ages[lastIndex]);
    }
}
```

Please use the visualizer. To see how it looks there.

What we learned:
* Array can store values of the same type
* Array makes code shorter
* Elements (values) have indexes in the array.
* We can get the size of the array `arrayName.length`
* the first element has an index `0`
* the Last element has index `arrayName.length - 1`
* array is also a type. Not primitive

More about operations over arrays:
* Create
  * create with default values
    * `<type>[] <arrayNameVariable> = new <type>[<arraysSize>];`
    * `int[] numbers = new int[10];`
    * `boolean[] numbers = new boolean[10];`
    * `String[] names = new String[10];`
  * create with predefined values
    * `int[] arrayNameVariable = new int[]{1,2,3,4,5,6};`
    * `String[] variableName = new String[]{"one", "two"};`
    * `char[] variableName = new char[]{'w', 'o', 'r', 'd'};`
* read
  * `<arrayNameVariable>[<index>]`
  * `int result = numbers[0];`
  * `System.out.prinln(numbers[0]);`
  * `int sum = numbers[0] + number[1];`
* write
  * `<arrayNameVariable>[<index>] = <value>;`
  * `numbers[0] = 88;`
  * `names[2] = "Oleg";`
***

This theory is boring. Let's move to the following lessons and do exercises.