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
      // Luckily we have only 7 students, what if we have 20 or more

      // Arrays help us to store element with more elegant way, at least less code
      String[] names = new String[]{"Oleksandr", "Oleksandra", "Valeria", "Evgen", "Oleg", "Nadia", "Ivanka"};
      int[] ages = new int[]{25, 30, 14, 28, 40, 50, 18};

      // Size of the array is
      System.out.println("Size of the class is " + names.length);
      System.out.println("Each student(element) that is located in array has an number(index)");
      // Get the first element from the array
      int firstIndex = 0;
      System.out.println("First. Name = " + names[firstIndex] + " age = " + ages[firstIndex]);

      // if class size 7, but indexes start from 0, as a result last element index is size - 1
      int lastIndex = names.length - 1;

      // As you see we use variable name and number (index) to access to element of array
      System.out.println("Last. Name = " + names[lastIndex] + " age = " + ages[lastIndex]);
   }
}